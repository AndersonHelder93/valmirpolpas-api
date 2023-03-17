package com.valmirpolpas.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valmirpolpas.api.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
