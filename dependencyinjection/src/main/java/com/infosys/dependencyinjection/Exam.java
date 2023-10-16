package com.infosys.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = context.getBean(Student.class);
		student.displayInfo();
	}

}
