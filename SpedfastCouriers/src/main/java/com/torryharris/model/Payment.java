package com.torryharris.model;

public class Payment {
	private String paymentId;
	private String customerId;
	private String amount;
	private String paymentType;
	private String date;
	public Payment() {
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.amount = amount;
		this.paymentType = paymentType;
		this.date = date;
	}
	public String getPaymentId() {
		return paymentId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getDate() {
		return date;
	}
	

}
