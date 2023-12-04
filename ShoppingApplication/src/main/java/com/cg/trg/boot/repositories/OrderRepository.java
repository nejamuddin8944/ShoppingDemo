package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trg.boot.dto.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
