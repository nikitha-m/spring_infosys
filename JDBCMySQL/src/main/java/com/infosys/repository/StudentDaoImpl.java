package com.infosys.repository;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.List;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;

import com.infosys.entity.Student;

import javax.sql.DataSource;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate template;

	public RowMapper<Student> srm = (resultSet, rowNum) -> {
		Student s = new Student();
		s.setRoll(resultSet.getInt(1));
		s.setName(resultSet.getString(2));
		s.setSubject(resultSet.getString(3));
		s.setFee(resultSet.getInt(4));
		s.setPhone(resultSet.getString(5));
		return s;
	};

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return template.query("select * from student", srm);
	}

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		template.execute("insert into student values(?, ?, ?, ?, ?)", (PreparedStatement ps) -> {
			ps.setInt(1, s.getRoll());
			ps.setString(2, s.getName());
			ps.setString(3, s.getSubject());
			ps.setInt(4, s.getFee());
			ps.setString(5, s.getPhone());
			return ps.executeUpdate();
		});
	}

	@Override
	public Student findById(int id) {
	    String sql = "SELECT * FROM student WHERE id = ?";
	    List<Student> students = template.query(sql, new RowMapper<Student>() {
	        @Override
	        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Student student = new Student();
	            student.setRoll(rs.getInt("id"));
	            student.setName(rs.getString("name"));
	            student.setSubject(rs.getString("subject"));
	            student.setFee(rs.getInt("fee"));
	            student.setPhone(rs.getString("phone"));
	            return student;
	        }
	    }, id);  // pass 'id' as an argument after the RowMapper

	    return students.isEmpty() ? null : students.get(0);
	}

}
