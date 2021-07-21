package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String getHello(Model model) {
		
		User user = service.getUser();
		System.out.println(user.getName());
		model.addAttribute("user",user);
		
		return "hello";
	}
}
