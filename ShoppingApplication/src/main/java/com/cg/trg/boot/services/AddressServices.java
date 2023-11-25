package com.cg.trg.boot.services;

import com.cg.trg.boot.dto.Address;

public interface AddressServices {
	
	Address addAddress(Address add);
	Address updateAddress(Address add);
	Address removeAddress(Address add);
	Address viewAllAddress(String id);
	Address viewAddress(Address add);
}
