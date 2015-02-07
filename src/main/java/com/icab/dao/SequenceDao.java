package com.icab.dao;

public interface SequenceDao {

	String getNext(final String name);

	void reset(final String name);

	void update(final String name);

}
