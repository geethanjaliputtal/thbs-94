package com.torryharris.model;

public class Dispatcher {
	private String dispatcherId;
	private String dispatcherName;
	private long phone;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String area;
	private String city;
	private String state;
	public Dispatcher() {
		this.dispatcherId = dispatcherId;
		this.dispatcherName = dispatcherName;
		this.phone = phone;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	
	public String getDispatcherId() {
		return dispatcherId;
	}
	
	public String getDispatcherName() {
		return dispatcherName;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
