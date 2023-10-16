package com.infosys.repository;

import com.infosys.entity.Student;

public interface StudentRepository {
	public void save(Student student);

	Student findById(Long id);
}
