package com.icab.dao;

import java.util.List;

import com.icab.model.OrderDetails;

public interface OrderDetailsDao {

	boolean create(final OrderDetails orderDetails);

	OrderDetails getOrderDetailsById(final String id);

	List<OrderDetails> getOrderDetailsByUserMobileNo(final String mobileNo);

	boolean update(final OrderDetails orderDetails);

	boolean delete(final String id);

}
