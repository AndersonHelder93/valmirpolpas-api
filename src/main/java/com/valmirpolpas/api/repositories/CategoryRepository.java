package com.valmirpolpas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valmirpolpas.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
