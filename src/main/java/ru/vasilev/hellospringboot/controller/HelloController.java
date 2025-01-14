package ru.vasilev.hellospringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${spring.message}")
	private String message;
	
	@GetMapping("/hello")
	public String sayHello() {
		return message;
	}
}