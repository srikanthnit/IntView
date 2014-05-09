package com.repo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.repo.dao.UserDao;
import com.repo.domain.User;
import com.repo.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public void insertData(User user) {
		userdao.insertData(user);
	}

	@Override
	public List<User> getUserList() {
		return userdao.getUserList();
	}

	@Override
	public void deleteData(String id) {
		userdao.deleteData(id);

	}

	@Override
	public User getUser(String id) {
		return userdao.getUser(id);
	}

	@Override
	public void updateData(User user) {
		userdao.updateData(user);

	}

	@Override
	public boolean authenticateUser(String name, String password) {
		if (userdao.getPassword(name).equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
