package com.infosys.autoscan4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);
	
		Service service = (Service) context.getBean("service");
		System.out.println(service.toString());
	}

}
