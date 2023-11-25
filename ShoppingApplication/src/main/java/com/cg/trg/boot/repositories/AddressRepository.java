package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trg.boot.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
