package com.viavis.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.viavis.app.dao.UserRepository;
import com.viavis.app.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository 
{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<User> getAll() {
		return entityManager.createQuery("from User",User.class).getResultList();
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByName(String name) {
		return entityManager.createQuery("from User where lower(name) = lower(:name)",User.class).setParameter("name", name).getResultList();
	}

	@Override
	public List<User> getByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(User userToCreate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User userToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteuser(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
