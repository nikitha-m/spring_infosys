package com.infosys.config;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.*;
import org.springframework.*;
import org.springframework.context.annotation.*;


@Configuration
public class AppConfig {

	public BasicDataSource dataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/db");
		bds.setUsername("root");
		bds.setPassword("admin");
		return bds;
	}

	public JdbcTemplate jdbcTemplate(DataSource ds) {

	}
}
