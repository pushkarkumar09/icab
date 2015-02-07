package com.icab.model;

import java.util.Date;

public class DeliveryDetails {

	private Date date;
	private String prefferedTime;
	private Address prefferedLocation;

	public Date getDate() {
		return date;
	}

	public String getPrefferedTime() {
		return prefferedTime;
	}

	public Address getPrefferedLocation() {
		return prefferedLocation;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPrefferedTime(String prefferedTime) {
		this.prefferedTime = prefferedTime;
	}

	public void setPrefferedLocation(Address prefferedLocation) {
		this.prefferedLocation = prefferedLocation;
	}

}
