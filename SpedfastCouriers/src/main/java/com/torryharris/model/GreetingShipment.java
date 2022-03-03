package com.torryharris.model;

public class GreetingShipment extends Shipment{


	private String greetingMessage;
	public GreetingShipment() {
		super();
		
	}
	public GreetingShipment(String greetingmessage,String shipmentId, String customerId, String priority, double weight,
			Address sendersAddress, Address recipientaddress, String deliveryDate) {
		super();
		
	}
	public String getGreetingMessage() {
		return greetingMessage;
	}
	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
	
	
}
