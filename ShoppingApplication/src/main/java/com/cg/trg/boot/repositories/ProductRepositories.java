package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trg.boot.dto.Product;
@Repository
public interface ProductRepositories extends JpaRepository<Product, String> {

}
