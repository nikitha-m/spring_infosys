package com.infosys.dependencyinjection;

public class Student {
	String studentName;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	void displayInfo()
	{
		System.out.println("Name: "+studentName);
	}
}
