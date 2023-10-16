package com.infosys.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infosys.repository.PlacesDao;
import com.infosys.repository.PlacesDaoImpl;
import com.infosys.service.PlacesService;


@Configuration
public class AppConfig {
	
	@Bean
	public PlacesDao studentDao() {
		return new PlacesDaoImpl();
	}
	@Bean
	public PlacesService studentService() {
		return new PlacesService();
	}
	
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource bds = new BasicDataSource ();
		
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/infosys");
		bds.setUsername("root");
		bds.setPassword("admin");
		return bds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
