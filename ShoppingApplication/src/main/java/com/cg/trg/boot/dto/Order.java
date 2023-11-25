package com.cg.trg.boot.dto;

import java.time.LocalDate;
import java.util.Map;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

public class Order {
	
	
	private String orderid;
	private LocalDate orderDate;
	private String orderStatus;
	private Customer customer;
	private Map productList;
	private Address address;
	public Order(String orderid, LocalDate orderDate, String orderStatus, Customer customer, Map productList,
			Address address) {
		super();
		this.orderid = orderid;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.productList = productList;
		this.address = address;
	}
	public Order() {
		super();
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map getProductList() {
		return productList;
	}
	public void setProductList(Map productList) {
		this.productList = productList;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", customer="
				+ customer + ", productList=" + productList + ", address=" + address + "]";
	}

}
