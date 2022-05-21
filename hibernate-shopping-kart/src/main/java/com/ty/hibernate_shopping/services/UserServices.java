package com.ty.hibernate_shopping.services;

import java.util.List;

import com.ty.hibernate_shopping.dao.UserDao;
import com.ty.hibernate_shopping.dto.User;

public class UserServices {

	public User saveUser(User user) {

		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		return user;

	}

	public User getUserById(int id) {
		UserDao userDao = new UserDao();
		return userDao.getUserById(id);

	}

	public List<User> getAllUser() {
		UserDao userDao = new UserDao();
		return userDao.getAllUser();

	}

	public boolean validateUser(String email, String password) {
		UserDao userDao = new UserDao();
		List<User> list = userDao.validateUser(email, password);
		if (list.size() > 0) {
			return true;
		}
		return false;

	}
	public User updateUser(User user) {
		UserDao userDao = new UserDao();
		return userDao.updateUser(user);
		
	}
	public User deleteUser(int id) {
		UserDao userDao = new UserDao();
		return userDao.deletedUser(id);
		
	}

}
