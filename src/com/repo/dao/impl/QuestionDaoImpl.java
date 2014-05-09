package com.repo.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.repo.dao.QuestionDao;
import com.repo.domain.Login;
import com.repo.domain.Question;
import com.repo.jdbc.QuestionRowMapper;

public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Question> getTeamSpecificQuestions(Login login) {
		String sql = "select q.question,tf.experience,tf.toughness,q.technology,q.question_id from questions q,toughness_factor tf where tf.question=q.question_id order by tf.toughness";
		List<Question> questions = new LinkedList<Question>();
		questions = jdbcTemplate.query(sql, new QuestionRowMapper());
		return questions;
	}

	@Override
	public String updateQuestion(Login login, Question question) {
		String sql = "update questions set question = ?,technology = ?,edited_by = ?";
		jdbcTemplate.update(sql, new Object[] { question.getQuestion(),
				question.getTechnology(), login.getUsername() });

		return null;
	}

}
