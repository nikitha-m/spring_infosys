package com.infosys.second;

public class Product {
	private String name;
	private Category category;
	
	public Product(String name, Category category) {
		this.name=name;
		this.category=category;
	}
	
	public void display() {
		System.out.println("Name: "+name+"Category: "+category.getCategoryName());
	}
}
