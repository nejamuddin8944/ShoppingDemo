package com.cg.trg.boot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.dto.Category;
import com.cg.trg.boot.dto.Product;
import com.cg.trg.boot.repositories.ProductRepositories;
import com.cg.trg.boot.services.ProductServices;

public class ProductServicesImpl implements ProductServices  {
	ProductRepositories repo;

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);		
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product viewProduct(int pId) {
		// TODO Auto-generated method stub
		return repo.getById(pId);
	}

	@Override
	public List<Product> viewProductByCategory(Category category) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean delete(int pId) {
		// TODO Auto-generated method stub
		return false;
	}

}