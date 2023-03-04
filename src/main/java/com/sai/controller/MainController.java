package com.sai.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	//localhost:8080/hello
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<h1>Hello World! Time on the server is "+LocalDateTime.now();
	}
}
