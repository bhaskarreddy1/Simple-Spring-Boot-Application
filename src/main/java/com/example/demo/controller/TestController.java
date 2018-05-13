package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/welcome/message")
	public String sayHello() {
		return "HI WElcome to java ";
	}

}
