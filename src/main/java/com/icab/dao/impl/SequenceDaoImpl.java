package com.icab.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.util.Assert;

import com.icab.dao.SequenceDao;
import com.icab.domain.SequenceId;

public class SequenceDaoImpl implements SequenceDao {

	private MongoOperations operations;

	@Autowired
	public SequenceDaoImpl(final MongoOperations operations) {
		Assert.notNull(operations);
		this.operations = operations;
	}

	@Override
	public String getNext(String name) {

		Query query = new Query(Criteria.where("name").is(name));

		Update update = new Update();
		update.inc("value", 1);

		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);

		SequenceId sequenceId = operations.findAndModify(query, update,
				options, SequenceId.class);

		return sequenceId.getValue();

	}

	@Override
	public void reset(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub

	}

}
