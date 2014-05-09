package com.repo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.repo.domain.Question;

public class QuestionRowMapper implements RowMapper<Question> {

	@Override
	public Question mapRow(ResultSet resultSet, int line) throws SQLException {
		QuestionExtractor queExtractor = new QuestionExtractor();
		return queExtractor.extractData(resultSet);
	}

}
