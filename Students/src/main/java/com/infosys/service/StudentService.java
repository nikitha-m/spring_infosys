package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.infosys.entity.Student;
import com.infosys.repository.StudentRepository;

public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Student findById(Long id) {
		return studentRepository.findById(id);
	}
}
