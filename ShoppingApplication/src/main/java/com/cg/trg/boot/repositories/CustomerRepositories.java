package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trg.boot.dto.Customer;

@Repository
public interface CustomerRepositories extends JpaRepository<Customer,Integer>{

}
