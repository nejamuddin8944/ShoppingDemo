package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trg.boot.dto.Customer;

public interface CustomerRepositories extends JpaRepository<Customer,Integer>{

}
