package com.viavis.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viavis.app.dao.UserRepository;
import com.viavis.app.model.User;
import com.viavis.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> findUsers() {
		return userRepository.getAll();
	}

	@Override
	public List<User> findByName(String name) {
		return userRepository.getByName(name);
	}

	@Override
	public User findUser(Long id) {
		User theUser =  userRepository.getById(id);
		return theUser;
	}

	@Override
	public void createUser(User user) {
		userRepository.createUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteuser(id);
		
	}

	@Override
	public List<User> findByPhoneNumber(String phoneNumber) {
		return userRepository.getByPhoneNumber(phoneNumber);
	}

}
