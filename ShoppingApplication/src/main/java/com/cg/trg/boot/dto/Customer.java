package com.cg.trg.boot.dto;

public class Customer {
	private String   customerId;
	private String firstName;
	private String lastname;
	private String mobileNumber;
	private String Address;
	private String Email;
	public Customer() {
		super();
	}
	public Customer(String customerId, String firstName, String lastname, String mobileNumber, String address,
			String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		Address = address;
		Email = email;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", mobileNumber=" + mobileNumber + ", Address=" + Address + ", Email=" + Email + "]";
	}
	

}
