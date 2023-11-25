package com.cg.trg.boot.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.repositories.AddressRepository;
import com.cg.trg.boot.services.AddressServices;

public class AddressServiceImpl implements AddressServices{

	@Autowired
	AddressRepository repo;
	
	@Override
	public Address addAddress(Address add) {
		
		return null;
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address removeAddress(Address add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address viewAllAddress(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address viewAddress(Address add) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
