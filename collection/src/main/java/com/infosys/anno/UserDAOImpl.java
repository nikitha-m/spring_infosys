package com.infosys.anno;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements userDAO {

	Map<Integer, User> repository = new TreeMap<>();

	@Override
	public void addUser(User u) {
		repository.put(u.getUid(), u);
	}

	@Override
	public List<User> findAll() {

		for (Map.Entry<Integer, User> u : repository.entrySet()) {
			User x = u.getValue();
			System.out.println(x);
		}
		return repository.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toList());
	}
}
