package com.infosys.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		LibraryService libraryService = (LibraryService) context.getBean("library");

	        for (Book book : libraryService.getBooks()) {
	            System.out.println(book.getBookName() + " by " + book.getBookAuthor());
	        }
	}

}
