package com.infosys.collection;

import java.util.Set;

public class Question {
	String question;
	Set<String> answers;
	
	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	public void display() {
		System.out.println("Mobile "+question);
		answers.stream().forEach(System.out::println);
	}
	
}
