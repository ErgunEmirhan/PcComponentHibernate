package com.eergun.repository;

import com.eergun.entity.User;

public class UserRepository extends RepositoryManager<User, Long>{
	public UserRepository() {
		super(User.class);
	}
}