package com.repo.services;

import java.util.List;

import com.repo.domain.User;

public interface UserService {
	public void insertData(User user);

	public List<User> getUserList();

	public void deleteData(String id);

	public User getUser(String id);

	public void updateData(User user);

	boolean authenticateUser(String name, String password);
}
