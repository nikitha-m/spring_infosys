package com.infosys.DependencyInjection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Order ord1 = context.getBean("ord", Order.class);
		ord1.displayord();
	}

}
