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

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.servicesImpl.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressServiceImpl service;
	
	@GetMapping
	public List<Address> viewAllAdress(){
		return service.viewAllAddress();
	}
	
	@GetMapping(value = "{id}/*")
	public ResponseEntity<Address> getAddress(@PathVariable int id){
	   Address address = service.viewAddress(id);
		return new ResponseEntity<Address>(address, HttpStatus.OK);	
	}
	
	@PostMapping()
	public ResponseEntity<String> addAddress(@RequestBody Address add){
		service.addAddress(add);
		return new ResponseEntity<String>("Address successfully saved",HttpStatus.OK);	
	}
	
	@PutMapping
	public ResponseEntity<String> updateAddress(Address add){
		return new ResponseEntity<String>("Address updated successfully",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable int id){
		service.removeAddress(id);
		return new ResponseEntity<String>("Address deleted successfully",HttpStatus.OK);
	}
}
