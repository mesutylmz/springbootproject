package com.viavis.app.service;

import java.util.List;

import com.viavis.app.model.User;

public interface UserService {
	
	List<User> 	findUsers			();
	List<User> 	findByName			(String name);
	List<User> 	findByPhoneNumber	(String phoneNumber);
	
	User		findUser(Long id);
	void 		createUser(User user);
	void		updateUser(User user);
	void		deleteUser(Long id);
	

}
