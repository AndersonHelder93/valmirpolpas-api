package com.valmirpolpas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valmirpolpas.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
