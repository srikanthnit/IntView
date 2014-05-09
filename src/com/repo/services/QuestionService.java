package com.repo.services;

import java.util.List;

import com.repo.domain.Login;
import com.repo.domain.Question;

public interface QuestionService {

	public List<Question> getTeamSpecificQuestions(Login login);

	String editQuestion(Login login, Question question);
}
