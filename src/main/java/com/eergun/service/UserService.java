package com.eergun.service;

import com.eergun.entity.User;
import com.eergun.repository.UserRepository;

public class UserService {
	UserRepository userRepository = new UserRepository();
	
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
}