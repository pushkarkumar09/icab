package com.icab.model;

import com.icab.constant.PrefferedDay;
import com.icab.constant.PreffredTime;

public class DeliveryDetails {

	private PrefferedDay prefferedDay;
	private PreffredTime prefferedTime;
	private Address prefferedLocation;
	
	public PrefferedDay getPrefferedDay() {
		return prefferedDay;
	}

	public void setPrefferedDay(PrefferedDay prefferedDay) {
		this.prefferedDay = prefferedDay;
	}

	public PreffredTime getPrefferedTime() {
		return prefferedTime;
	}

	public Address getPrefferedLocation() {
		return prefferedLocation;
	}	

	public void setPrefferedTime(PreffredTime prefferedTime) {
		this.prefferedTime = prefferedTime;
	}

	public void setPrefferedLocation(Address prefferedLocation) {
		this.prefferedLocation = prefferedLocation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeliveryDetails [prefferedDay=");
		builder.append(prefferedDay);
		builder.append(", prefferedTime=");
		builder.append(prefferedTime);
		builder.append(", prefferedLocation=");
		builder.append(prefferedLocation);
		builder.append("]");
		return builder.toString();
	}
	
	

}
