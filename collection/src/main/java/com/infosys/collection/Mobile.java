package com.infosys.collection;

import java.util.List;

public class Mobile {
	String mobile;
	List<String> models;
	
	public Mobile(String mobile, List<String> models) {
		this.mobile=mobile;
		this.models=models;
	}
	public void display() {
		System.out.println("Mobile "+mobile);
		models.stream().forEach(System.out::println);
	}
}	
