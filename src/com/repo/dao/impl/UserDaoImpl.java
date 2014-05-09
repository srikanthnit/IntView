package com.repo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.repo.dao.UserDao;
import com.repo.domain.User;
import com.repo.jdbc.UserRowMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertData(User user) {

		String sql = "INSERT INTO user "
				+ "(user_name,email,team, password,admin) VALUES (?, ?, ?,?,?)";

		jdbcTemplate.update(
				sql,
				new Object[] { user.getUserName(), user.getEmail(),
						user.getTeam(), "test123", user.getAdmin() });

	}

	public List<User> getUserList() {
		List userList = new ArrayList();

		String sql = "select id,user_name,team,email,admin from user";

		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList;
	}

	@Override
	public void deleteData(String id) {
		String sql = "delete from user where user_id=" + id;
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(User user) {

		String sql = "UPDATE user set user_name = ?,email = ?, team = ?,admin = ? where id = ?";

		jdbcTemplate.update(
				sql,
				new Object[] { user.getUserName(), user.getEmail(),
						user.getTeam(), user.getAdmin(), user.getUserId() });
	}

	@Override
	public User getUser(String id) {
		List<User> userList = new ArrayList<User>();
		String sql = "select * from user where id= " + id;
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList.get(0);
	}

	@Override
	public String getPassword(String name) {
		String sql = "select password from user where user_name = '" + name
				+ "'";
		return jdbcTemplate.queryForObject(sql, String.class);
	}

}
