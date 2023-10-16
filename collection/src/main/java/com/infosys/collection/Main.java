package com.infosys.collection;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ColorList color=(ColorList) context.getBean("colList");
		color.display();
		
		Mobile mobile= (Mobile) context.getBean("mobile");
		mobile.display();
		
		Question question = (Question) context.getBean("quesSet");
		question.display();
	}

}
