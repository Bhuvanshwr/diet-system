package com.diet.system.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diet.system.entity.User;
import com.diet.system.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	@Transactional 
	public User addUser(User theUser) {
		// TODO Auto-generated method stub
			
		return userRepository.save(theUser);
	}

	@Override
	@Transactional
	public void deleteUser(User theUser) {
		// TODO Auto-generated method stub
		userRepository.delete(theUser);

	}

	@Override
	@Transactional
	public User getByUserId(int theUserId) {
		// TODO Auto-generated method stub
		return userRepository.getOne(theUserId);
	}

	@Override
	@Transactional
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}


}
