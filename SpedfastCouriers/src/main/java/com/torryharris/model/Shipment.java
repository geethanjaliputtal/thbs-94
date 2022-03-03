package com.torryharris.model;

import java.sql.Date;

public class Shipment {
	private String shipmentId;
	 String customerId;
	 String priority;
	 double weight;
	 Address sendersAddress;
	 Address recipientaddress;
	 String deliveryDate;
	
	public Shipment(String a, String b, String m, String d, String h, String e) {
	}
	public Shipment() {
		this.shipmentId = shipmentId;
		this.customerId = customerId;
		this.priority = priority;
		this.weight = weight;
		this.sendersAddress = sendersAddress;
		this.recipientaddress = recipientaddress;
		this.deliveryDate = deliveryDate;
	}
	
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Address getSendersAddress() {
		return sendersAddress;
	}
	public void setSendersAddress(Address sendersAddress) {
		this.sendersAddress = sendersAddress;
	}
	public Address getRecipientaddress() {
		return recipientaddress;
	}
	public void setRecipientaddress(Address recipientaddress) {
		this.recipientaddress = recipientaddress;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
}
