package com.cg.trg.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.trg.boot.dto.Product;
import com.cg.trg.boot.servicesImpl.ProductServicesImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServicesImpl service;
	
	public List<Product> viewAllProducts(){
		return service.viewAllProducts();
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Product> getProduct(@PathVariable String pId){
	   Product product = service.viewProduct(pId);
		return new ResponseEntity<Product>(product, HttpStatus.OK);	
	}
	
	@PostMapping()
	public ResponseEntity<String> saveProduct(@RequestBody Product p){
		service.save(p);
		return new ResponseEntity<String>("Product saved",HttpStatus.OK);	
	}

	@PutMapping
	public ResponseEntity<String> updateProduct(Product p){
		return new ResponseEntity<String>("Product updated success",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable String pId){
		service.delete(pId);
		return new ResponseEntity<String>("Product deleted",HttpStatus.OK);
	}	

}
