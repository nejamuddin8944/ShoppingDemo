package com.cg.trg.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cg.trg.boot.dto.Address;
import com.cg.trg.boot.dto.Cart;
import com.cg.trg.boot.dto.Category;

import com.cg.trg.boot.dto.Customer;
import com.cg.trg.boot.dto.Product;
import com.cg.trg.boot.repositories.AddressRepository;
import com.cg.trg.boot.repositories.CartRepositories;
import com.cg.trg.boot.repositories.CategoryRepositories;
import com.cg.trg.boot.repositories.CustomerRepositories;
import com.cg.trg.boot.repositories.OrderRepository;
import com.cg.trg.boot.repositories.ProductRepositories;

@Service
public class DbInitForAllEntity implements CommandLineRunner{
	
	@Autowired
	AddressRepository addRepo;
	@Autowired
	CategoryRepositories catRepo;
	@Autowired
	CartRepositories cartRepo;
	@Autowired
	CustomerRepositories custRepo;
	@Autowired
	OrderRepository ordRepo;
	@Autowired
	ProductRepositories prodRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		//Creating Addres object
		Address add1,add2,add3;
		add1=new Address(10, "MG-21", "GAR-Infobahn", "Hyderabad", "Telangana", "India", "720001");
		add2=new Address(20, "MG-22", "GAR-Infobahn", "Kolkata", "West Bengal", "India", "70001");
		add3=new Address(30, "MG-23", "GAR-Infobahn", "Gurgaon", "Haryana", "India", "720001");
		
		//Adding Data to Address Table
		addRepo.save(add1);
		addRepo.save(add2);
		addRepo.save(add3);
		
		//Creating Category Object
		Category cat1,cat2,cat3;
		cat1=new Category("Z-602", "Electronics");
		cat2=new Category("Z-801", "Clothing");
		cat3=new Category("Z-878", "Furniture");
		
		//Adding Data to Category Table
		catRepo.save(cat1);
		catRepo.save(cat2);
		catRepo.save(cat3);
		
		//Creating Customer Object
		Customer cust1=new Customer("10", "prabha", "vb", "9980365846", add1, "prabhav@gmail.com");
		Customer cust2=new Customer("20", "Swati", "yeli ", "2233665599", add2, "swati123@gmail.com");
		
		//Adding Data to customer Table
		custRepo.save(cust1);
		custRepo.save(cust2);
		
		//Creating Product Object
		Product prd1=new Product("1001", "laptop", 120000, "Red", "12*36", "specification1", "manudacturer1", 120, cat1);
		Product prd2=new Product("1002", "Mobile", 45000, "Blue", "10*12", "specification2", "manudacturer2", 110, cat2);
		
		Product prd3=new Product("1003", "iPhone11", 120000, "Red", "12*36", "specification3", "manudacturer3", 140, cat3);
		Product prd4=new Product("1004", "iPhone12", 450000, "Blue", "10*12", "specification4", "manudacturer4", 160, cat1);
		
		List<Product> products1=new ArrayList<Product>();
		products1.add(prd1);
		products1.add(prd2);
		
		List<Product> products2=new ArrayList<Product>();
		products2.add(prd3);
		products2.add(prd4);
		
		//Creating Cart objects
		Cart cart1=new Cart("100", cust1, products1);
		Cart cart2=new Cart("100", cust2, products2);
		
		//Adding Data to Cart Table
		cartRepo.save(cart1);
		cartRepo.save(cart2);
		
		//Adding data to the product table
		prodRepo.save(prd1);
		prodRepo.save(prd2);
		prodRepo.save(prd3);
		prodRepo.save(prd4);
		
		//Adding Data to the Order table
		
		
		
	}

}
