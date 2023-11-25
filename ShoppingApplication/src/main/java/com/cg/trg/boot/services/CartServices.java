package com.cg.trg.boot.services;

import java.util.List;

import com.cg.trg.boot.dto.Cart;
import com.cg.trg.boot.dto.Product;

public interface CartServices {
	void save(Cart cart, Product p, int quantity);
	boolean deleteProductFromCart(Cart cart, Product p);
	boolean updateProductQuantity(Cart cart,Product p,int quantity);
	boolean delete(Cart cart);
	List<Product> getAllProducts(Cart cart);
	

}
