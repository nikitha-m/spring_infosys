package com.infosys.entity;

public class Student {
	int roll;
	String name;
	String subject;
	int fee;
	String phone;
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + ", fee=" + fee + ", phone=" + phone
				+ "]";
	}
	public Student(int roll, String name, String subject, int fee, String phone) {
		super();
		this.roll = roll;
		this.name = name;
		this.subject = subject;
		this.fee = fee;
		this.phone = phone;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
