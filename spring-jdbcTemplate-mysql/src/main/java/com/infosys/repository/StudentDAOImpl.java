package com.infosys.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl {
	
	@Autowired
	JdbcTemplate template;

	public RowMapper<Student> srm =(rs, rowNum)->{
		Student s = new Student();
		s.setRoll(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setSubject(rs.getString(3));
		s.setFee(rs.getInt(4));
		s.setPhone(rs.getLong(5));
		return s;
	}
}
