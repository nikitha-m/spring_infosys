package com.infosys.second;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age, Address address) {
		this.name=name;
		this.age=age;
		this.address=address;	}
	
	public void display() {
		System.out.println("Hi "+name+"("+age+")");
		System.out.println("Your address is "+address.getAddress());
	}
}
