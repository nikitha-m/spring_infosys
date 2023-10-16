package com.infosys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// since objAirtel is of Airtel data type, it has to be typecasted

//		Airtel objAirtel = context.getBean("airtel", Airtel.class);
		
		//since we are providing abstraction, we use interface instead of classes which can be done as follows:
		Sim airtel=(Sim)context.getBean("airtel");
		airtel.calling();
		airtel.data();
		

		Jio objJio = (Jio) context.getBean("jio");
		objJio.calling();
		objJio.data();
	}

}
