package com.infosys.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.AppConfig;
import com.infosys.entity.Student;
import com.infosys.service.StudentService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	 
		StudentService sService = (StudentService) ctx.getBean(StudentService.class);
		List<Student> student = sService.showAll();
		
		Student s = new Student(5, "Nik", "Python", 12345, "123-345");
		
		System.out.println("==========================================");
		sService.add(s);
		System.out.println("Added");
		student.forEach(System.out::println);
		System.out.println("==========================================");
		Student res = sService.find(2);
		System.out.println(res);
	}

}
