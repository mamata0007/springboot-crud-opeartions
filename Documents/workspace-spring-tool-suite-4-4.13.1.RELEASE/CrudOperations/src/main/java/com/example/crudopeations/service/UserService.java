package com.example.crudopeations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudopeations.Entity.User;
import com.example.crudopeations.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User createUser(User user) {
		return userRepository.save(user);
		
	}
	  
	public User getUser(Long id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	 public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
	    public Optional<User> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    // Update user
	    public User updateUser(Long id, User userDetails) {
	        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	        user.setName(userDetails.getName());
	        user.setEmail(userDetails.getEmail());
	        return userRepository.save(user);
	    }

	    // Delete user
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}



