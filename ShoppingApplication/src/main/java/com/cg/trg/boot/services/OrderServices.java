package com.cg.trg.boot.services;

import java.util.List;

import com.cg.trg.boot.dto.Order;

public interface OrderServices {
	Boolean addOrder(Order ord);
	Boolean updateOrder(Order ord);
	Boolean removeOrder(String ordId);
	Order viewOrder(String ordId);
	List<Order> viewAllOrder();
}
