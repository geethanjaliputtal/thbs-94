package com.torryharris.model;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String phone;
	private String email;
	private String status;
	private Address custAddress;
	public Customer() {
	}
	public Customer(String customerId, String customerName, String email, String phone,String status, Address custAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.phone = phone;
		this.email = email;
		this.status=status;
		this.custAddress = custAddress;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	
}