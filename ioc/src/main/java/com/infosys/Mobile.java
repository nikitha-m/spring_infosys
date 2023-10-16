package com.infosys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To manage and handle objects. First step of adding ioc container which includes 2 interfaces: Application Context
		// and BeanFactory
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("Configuration successful");
	}

}
