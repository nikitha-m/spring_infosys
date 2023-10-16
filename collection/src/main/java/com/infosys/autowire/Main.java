package com.infosys.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		
		Person person = (Person) context.getBean("person");
		person.display();
	}

}
