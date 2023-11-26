package com.cg.trg.boot.services;

import java.util.List;

import com.cg.trg.boot.dto.Address;

public interface AddressServices {
	
	Boolean addAddress(Address add);
	Boolean updateAddress(Address add);
	Boolean removeAddress(int addId);
	Address viewAddress(int addId);
	List<Address> viewAllAddress();
}
