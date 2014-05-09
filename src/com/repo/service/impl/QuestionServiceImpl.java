package com.repo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.repo.dao.QuestionDao;
import com.repo.domain.Login;
import com.repo.domain.Question;
import com.repo.services.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao questionDao;

	@Override
	public List<Question> getTeamSpecificQuestions(Login login) {

		return questionDao.getTeamSpecificQuestions(login);
	}

	@Override
	public String editQuestion(Login login, Question question) {

		return questionDao.updateQuestion(login, question);
	}

}
