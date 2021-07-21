package com.example.demo.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloRepository repository;
	
	public User getUser() {
		
		Map<String,Object> map = repository.findById();
		
		int userId = (Integer) map.get("id");
		String name = (String) map.get("name");
		String password = (String) map.get("password");
		
		User user = new User();
		user.setId(userId);
		user.setName(name);
		user.setPassword(password);
		
		return user;
		
		
	}

}
