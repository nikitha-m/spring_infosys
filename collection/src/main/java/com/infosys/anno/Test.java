package com.infosys.anno;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
	
		UserService service = (UserService) ctx.getBean("userService");
		service.save(new User(1, "John"));
		service.save(new User(2, "Robert"));
		
		List<User> u = service.findAll();
	}

}
