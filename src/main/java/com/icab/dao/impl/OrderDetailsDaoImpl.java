package com.icab.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.util.Assert;

import com.icab.dao.OrderDetailsDao;
import com.icab.dao.SequenceDao;
import com.icab.model.OrderDetails;
import com.mongodb.WriteResult;

public class OrderDetailsDaoImpl implements OrderDetailsDao {

	private MongoOperations operations;
	private SequenceDao sequenceDao;

	private static final String ORDER_DETAILS_COLLECTION = "order_details";
	private static final String ORDER_DETAILS_SEQ = "order_details_seq";

	@Autowired
	public OrderDetailsDaoImpl(final MongoOperations operations,
			final SequenceDao sequenceDao) {
		Assert.notNull(operations);
		this.operations = operations;
		this.sequenceDao = sequenceDao;

	}

	@Override
	public boolean create(OrderDetails orderDetails) {
		if (StringUtils.isBlank(orderDetails.getId())) {
			orderDetails.setId(sequenceDao.getNext(ORDER_DETAILS_SEQ));
			operations.insert(orderDetails, ORDER_DETAILS_COLLECTION);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public OrderDetails getOrderDetailsById(String id) {
		return operations.findOne(new Query(Criteria.where("id").is(id)),
				OrderDetails.class);
	}

	@Override
	public List<OrderDetails> getOrderDetailsByUserMobileNo(String mobileNo) {

		Query query = new Query();
		query.addCriteria(Criteria.where("user.mobile").is(mobileNo));
		return operations.find(query, OrderDetails.class);
	}

	@Override
	public boolean update(OrderDetails orderDetails) {
		operations.save(orderDetails, ORDER_DETAILS_COLLECTION);
		return true;
	}

	@Override
	public boolean delete(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		WriteResult result = operations.remove(query, ORDER_DETAILS_COLLECTION);
		if (result.getN() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
