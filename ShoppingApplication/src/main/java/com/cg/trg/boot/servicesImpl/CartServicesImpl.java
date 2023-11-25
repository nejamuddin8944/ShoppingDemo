package com.cg.trg.boot.servicesImpl;

import java.util.List;

import com.cg.trg.boot.dto.Cart;
import com.cg.trg.boot.dto.Product;
import com.cg.trg.boot.services.CartServices;

public class CartServicesImpl implements CartServices {

	@Override
	public void save(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteProductFromCart(Cart cart, Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductQuantity(Cart cart, Product p, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProducts(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
