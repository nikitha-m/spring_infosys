package com.infosys.autoscan2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);
	
		Mobile mobile = (Mobile) context.getBean("mobile");
		System.out.println(mobile.toString());
	}

}
