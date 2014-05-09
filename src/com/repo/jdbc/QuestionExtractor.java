package com.repo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.repo.domain.Question;

public class QuestionExtractor implements ResultSetExtractor<Question> {

	public Question extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {

		Question que = new Question();

		que.setQuestion(resultSet.getString(1));
		que.setExperience(resultSet.getString(2));
		que.setToughnessFactor(resultSet.getInt(3));
		que.setTechnology(resultSet.getString(4));
		que.setQuestionId(resultSet.getInt(5));

		return que;
	}
}
