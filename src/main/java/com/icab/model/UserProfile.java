package com.icab.model;

public class UserProfile {

	private String fullName;
	private String mobile;
	private String email;
	private Address address;

	public String getFullName() {
		return fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
