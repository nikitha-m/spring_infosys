package com.infosys.aop_assn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        Bank bank = context.getBean(Bank.class);

	        bank.deposit(1000);
	        bank.checkBalance();
	}

}
