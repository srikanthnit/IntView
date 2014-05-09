package com.repo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.repo.domain.User;

public class UserExtractor implements ResultSetExtractor<User> {

	public User extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {

		User user = new User();

		user.setUserId(resultSet.getInt(1));
		user.setUserName(resultSet.getString(2));
		user.setTeam(resultSet.getString(3));
		user.setEmail(resultSet.getString(4));
		user.setAdmin(resultSet.getString(5));

		return user;
	}

}
