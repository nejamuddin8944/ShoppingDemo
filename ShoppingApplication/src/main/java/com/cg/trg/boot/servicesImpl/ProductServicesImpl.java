package com.cg.trg.boot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trg.boot.dto.Category;
import com.cg.trg.boot.dto.Product;
import com.cg.trg.boot.exceptions.ProductNotFoundException;
import com.cg.trg.boot.repositories.ProductRepositories;
import com.cg.trg.boot.services.ProductServices;

@Service
public class ProductServicesImpl implements ProductServices  {
	@Autowired
	ProductRepositories repo;

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);		
	}

	@Override
	public void update(Product p) {
		
	Optional<Product> opt = repo.findById(p.getProductId());
	if(opt.isPresent()) {
		repo.save(p);
	}
	else {
		throw new ProductNotFoundException("product not found");
	}
		
	}
	@Override
	public List<Product> viewProductByCategory(Category category) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product viewProduct(String pId) {
		
		Optional<Product> opt = repo.findById(pId);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new ProductNotFoundException("product is not there to view");			
		}
		
	}

	@Override
	public boolean delete(String pId) {
		Optional<Product> opt = repo.findById(pId);
		if(opt.isPresent()) {
			repo.deleteById(pId);
			return true;
		}
		throw new ProductNotFoundException("product not found to delete");
	}

}