package com.cg.trg.boot.dto;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Customer {
	@Id
	private String customerId;
	private String firstName;
	private String lastname;
	private String mobileNumber;

	@OneToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "addressId")
	private Address address;
	private String Email;
	public Customer() {
		super();
	}
	public Customer(String customerId, String firstName, String lastname, String mobileNumber,
			Address address, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
				+ ", mobileNumber=" + mobileNumber + ", Address=" + address + ", Email=" + Email + "]";
	}
	
	
	
	

}
