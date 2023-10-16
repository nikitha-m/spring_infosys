package com.infosys.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infosys.entity.Student;

public class StudentRepositoryImpl {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(Student student) {
		String sql = "INSERT INTO student (id, name, subject) VALUES (001, 'Nikitha', 'Maths')";
		jdbcTemplate.update(sql, student.getName(), student.getSubject());

	}

	@Override
	public Student findById(Long id) {
		String sql = "SELECT * FROM student WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, (rs, rowNum) -> {
			Student student = new Student();
			student.setId(rs.getLong("id"));
			student.setName(rs.getString("name"));
			student.setSubject(rs.getString("subject"));
			return student;
		});
	}
}
