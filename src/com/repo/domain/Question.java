package com.repo.domain;

public class Question {

	private int questionId;
	private String question;
	private String experience;
	private float toughnessFactor;
	private String author;
	private String technology;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public float getToughnessFactor() {
		return toughnessFactor;
	}

	public void setToughnessFactor(float toughnessFactor) {
		this.toughnessFactor = toughnessFactor;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
