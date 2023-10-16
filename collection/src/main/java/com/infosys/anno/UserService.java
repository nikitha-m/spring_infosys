package com.infosys.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class UserService {

	@Autowired
	UserDAOImpl repo;
	
	public void save(User u) {
		repo.addUser(u);
	}
	
}
