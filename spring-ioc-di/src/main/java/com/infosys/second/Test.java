package com.infosys.second;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person) context.getBean("person1");
		p.display();
		
		Product prod=(Product) context.getBean("product");
		prod.display();
		
	}

}
