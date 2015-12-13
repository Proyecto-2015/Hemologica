package org.hemologica.datatypes;

import java.util.List;

public class DataQuestion {
	
	private String question;
	private List<DataAnswer> answers;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<DataAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<DataAnswer> answers) {
		this.answers = answers;
	}
	
}
