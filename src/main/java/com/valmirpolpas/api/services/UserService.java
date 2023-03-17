package com.valmirpolpas.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valmirpolpas.api.entities.Users;
import com.valmirpolpas.api.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Users> findAll(){
		return userRepository.findAll();
	}
	
	public Users findById(Long id) {
		Optional<Users> obj =  userRepository.findById(id);
		return obj.get();
	}

}
