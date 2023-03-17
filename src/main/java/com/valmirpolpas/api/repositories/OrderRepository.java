package com.valmirpolpas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valmirpolpas.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
