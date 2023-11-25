package com.cg.trg.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.trg.boot.dto.Category;

public interface CategoryRepositories extends JpaRepository<Category, String>{

}
