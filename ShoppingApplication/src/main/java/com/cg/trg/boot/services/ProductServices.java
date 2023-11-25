package com.cg.trg.boot.services;

import java.util.Collection;
import java.util.List;

import com.cg.trg.boot.dto.Product;

public interface ProductServices {
	
	List<Product> getAllProducts();
	void save(Product p);
	boolean update(Product p);
	Product getProduct(int pId);
	List<Product> getProductByCategory(Category category);
	boolean delete(int pId);
	

}
