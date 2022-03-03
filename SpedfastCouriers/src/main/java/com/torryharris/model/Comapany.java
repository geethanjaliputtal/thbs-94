package com.torryharris.model;

public class Comapany {
	
	private String companyId;
	private String companyName;
	private long phone;
	private String email;
	private Address redgAddress;
	public Comapany() {
		this.companyId = companyId;
		this.companyName = companyName;
		this.phone = phone;
		this.email = email;
		this.redgAddress = redgAddress;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public Address getRedgAddress() {
		return redgAddress;
	}
	public void setRedgAddress(Address redgAddress) {
		this.redgAddress = redgAddress;
	}
	@Override
	public String toString() {
		return "Comapany [companyId=" + companyId + ", companyName=" + companyName + ", phone=" + phone + ", email="
				+ email + ", redgAddress=" + redgAddress + "]";
	}

	

}
