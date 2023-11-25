package com.cg.trg.boot.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "order_table")
public class Order {
	
	@Id
	private String orderId;
	private LocalDate orderDate;
	private String orderStatus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	private List<Product> products;

	
	
	public Order(String orderId, LocalDate orderDate, String orderStatus, Customer customer, List<Product> products,
			Address address) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
//		this.products = products;
	}
	public Order() {
		super();
	}
	public String getOrderid() {
		return orderId;
	}
	public void setOrderid(String orderid) {
		this.orderId = orderid;
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
	
//	public List<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
//	@Override
//	public String toString() {
//		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", customer="
//				+ customer + ", products=" + products + "]";
//	}
	
	

}
