package com.diet.system.service;

import java.util.List;

import com.diet.system.entity.User;



public interface UserService {
	
	public User addUser(User theUser);

	public void deleteUser(User theUser);
	
	

	public 	List<User> getAllUser();

	User getByUserId(int theUserId);
}
