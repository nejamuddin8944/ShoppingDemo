package com.cg.trg.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.dto.Category;
import com.cg.trg.boot.dto.Customer;
import com.cg.trg.boot.repositories.AddressRepository;
import com.cg.trg.boot.repositories.CartRepositories;
import com.cg.trg.boot.repositories.CategoryRepositories;
import com.cg.trg.boot.repositories.CustomerRepositories;
import com.cg.trg.boot.repositories.ProductRepositories;

@Service
public class DbInitForAllEntity implements CommandLineRunner{
	
	@Autowired
	AddressRepository addRepo;
	@Autowired
	CartRepositories cartRepo;
	@Autowired
	CategoryRepositories catRepo;
	@Autowired
	CustomerRepositories custRepo;
	@Autowired
	ProductRepositories prodRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		//Adding Data to Address Table
		addRepo.save(new Address(10, "MG-21", "GAR-Infobahn", "Hyderabad", "Telangana", "India", "720001"));
		addRepo.save(new Address(20, "MG-22", "GAR-Infobahn", "Kolkata", "West Bengal", "India", "70001"));
		
		//Adding Data to Category Table
		catRepo.save(new Category("Z-602", "Electronics"));
		catRepo.save(new Category("Z-801", "Clothing"));
		
		//Adding Data to customer Table
		custRepo.save(new Customer("10", "prabha", "vb", "9980365846", null, "prabhav@gmail.com"));
		custRepo.save(new Customer("20", "Swati", "yeli ", "2233665599", null, "swati123@gmail.com"));
		
	}

}
