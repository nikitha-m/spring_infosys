package com.infosys.university;

public class Student {
	private String usn;
	private String studentName;
	
	private Course course;

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void displayInfo()
	{
		System.out.println("Studnt USN: "+usn);
		System.out.println("Studnt name: "+studentName);
		System.out.println("Course id: "+course.getCourseId().toString());
		System.out.println("Course name: "+course.getCourseName().toString());
	}
}
