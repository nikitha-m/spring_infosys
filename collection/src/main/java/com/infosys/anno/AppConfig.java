package com.infosys.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public UserService userService() {
		return new UserService();
	}
	@Bean
	public UserDAOImpl userDAOImpl() {
		return new UserDAOImpl();
	}
}
