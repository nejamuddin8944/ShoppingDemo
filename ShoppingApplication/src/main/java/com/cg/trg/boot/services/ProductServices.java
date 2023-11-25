package com.cg.trg.boot.services;

import java.util.List;

import com.cg.trg.boot.dto.Category;
import com.cg.trg.boot.dto.Product;

public interface ProductServices {
	
	List<Product> viewAllProducts();
	void save(Product p);
	void update(Product p);
	Product viewProduct(int pId);
	List<Product> viewProductByCategory(Category category);
	boolean delete(int pId);
	

}
