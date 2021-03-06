package com.icab.model;

import com.icab.constant.OrderStatus;
import com.icab.constant.OrderType;

public class Order {

	private OrderType type;
	private String description;
	private DeliveryDetails deliveryDetails;
	private OrderStatus orderStatus;

	public OrderType getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public DeliveryDetails getDeliveryDetails() {
		return deliveryDetails;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setType(OrderType type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [type=");
		builder.append(type);
		builder.append(", description=");
		builder.append(description);
		builder.append(", deliveryDetails=");
		builder.append(deliveryDetails);
		builder.append(", orderStatus=");
		builder.append(orderStatus);
		builder.append("]");
		return builder.toString();
	}
	
	

}
