package com.cg.trg.boot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.exceptions.AddressNotFoundException;
import com.cg.trg.boot.exceptions.DuplicateAddressFoundException;
import com.cg.trg.boot.exceptions.NullAddressListException;
import com.cg.trg.boot.repositories.AddressRepository;
import com.cg.trg.boot.services.AddressServices;

@Service
public class AddressServiceImpl implements AddressServices{

	@Autowired
	AddressRepository repo;

	@Override
	public Boolean addAddress(Address add) {
		Optional<Address> opt = repo.findById(add.getAddressId());
		if(opt.isPresent())
			throw new DuplicateAddressFoundException("Address already exists");
		else
			repo.save(add);
		return true;
	}

	@Override
	public Boolean updateAddress(Address add) {
		Optional<Address> opt = repo.findById(add.getAddressId());
		if(opt.isPresent()) {
//			Address existingAddress =opt.get();
//			Address updatedAddress = new Address(existingAddress.getAddressId(),
//												 existingAddress.getStreetNo(), 
//												 existingAddress.getBuildingName(), 
//												 existingAddress.getCity(), 
//												 existingAddress.getState(), 
//												 existingAddress.getCountry(), 
//												 existingAddress.getPincode());
			
			repo.save(add);
			return true;
		}
		throw new AddressNotFoundException("Address not found");
			
	}

	@Override
	public Boolean removeAddress(int addId) {
		Optional<Address> opt = repo.findById(addId);
		Address address = opt.get();
		if(opt.isPresent()) {
			repo.delete(address);
			return true;
		}
		throw new AddressNotFoundException("Addres not found");
	}

	@Override
	public List<Address> viewAllAddress() {
		List<Address> addressList = repo.findAll();
		if(addressList==null || addressList.isEmpty()) {
			throw new NullAddressListException("Address list is empty");
		}
		return addressList;
	}

	@Override
	public Address viewAddress(int addId) {
		Optional<Address> opt = repo.findById(addId);
		if(opt.isPresent()) {
			return opt.get();	
		}
		throw new AddressNotFoundException("Addres with id: "+addId+" doesn't exists");
	}
	
	
	
}
