package com.repo.dao;

import java.util.List;

import com.repo.domain.Login;
import com.repo.domain.Question;

public interface QuestionDao {

	public List<Question> getTeamSpecificQuestions(Login login);

	public String updateQuestion(Login login, Question question);
}
