package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trg.boot.dto.Category;

@Repository
public interface CategoryRepositories extends JpaRepository<Category, String>{

}
