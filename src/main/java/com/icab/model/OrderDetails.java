package com.icab.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderDetails {

	@Id
	private String id;
	private UserProfile user;
	private Order order;
	
	
	public String getId() {
		return id;
	}
	public UserProfile getUser() {
		return user;
	}
	public Order getOrder() {
		return order;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUser(UserProfile user) {
		this.user = user;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	

}
