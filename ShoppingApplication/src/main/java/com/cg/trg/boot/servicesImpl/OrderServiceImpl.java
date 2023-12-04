package com.cg.trg.boot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.trg.boot.dto.Order;
import com.cg.trg.boot.exceptions.AddressNotFoundException;
import com.cg.trg.boot.exceptions.DuplicateOrderFoundException;
import com.cg.trg.boot.exceptions.NullAddressListException;
import com.cg.trg.boot.exceptions.OrderNotFoundException;
import com.cg.trg.boot.repositories.OrderRepository;
import com.cg.trg.boot.services.OrderServices;

public class OrderServiceImpl implements OrderServices{

	@Autowired
	OrderRepository repo;

	@Override
	public Boolean addOrder(Order ord) {
		Optional<Order> opt = repo.findById(ord.getOrderid());
		if(opt.isPresent())
			throw new DuplicateOrderFoundException("Order already exists");
		else
			repo.save(ord);
		return true;
	}

	@Override
	public Boolean updateOrder(Order ord) {
		Optional<Order> opt = repo.findById(ord.getOrderid());
		if(opt.isPresent()) {
			
			repo.save(ord);
			return true;
		}
		throw new OrderNotFoundException("Order not found");
			
	}

	@Override
	public Boolean removeOrder(String ordId) {
		Optional<Order> opt = repo.findById(ordId);
		Order order = opt.get();
		if(opt.isPresent()) {
			repo.delete(order);
			return true;
		}
		throw new OrderNotFoundException("Order not found");
	}

	@Override
	public List<Order> viewAllOrder() {
		List<Order> orderList = repo.findAll();
		if(orderList==null || orderList.isEmpty()) {
			throw new NullAddressListException("Orderlist is empty");
		}
		return orderList;
	}

	@Override
	public Order viewOrder(String ordId) {
		Optional<Order> opt = repo.findById(ordId);
		if(opt.isPresent()) {
			return opt.get();	
		}
		throw new AddressNotFoundException("Order with id: "+ordId+" doesn't exists");
	}

}
