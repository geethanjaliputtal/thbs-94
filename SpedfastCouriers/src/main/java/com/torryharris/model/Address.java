package com.torryharris.model;

public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String landmark;
	private String area;
	private String city;
	private String pincode;
	
	public Address() {
	}
	public Address(String addressLine1, String addressLine2, String landmark, String area, String city, String pincode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.landmark = landmark;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
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
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", landmark=" + landmark
				+ ", area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
