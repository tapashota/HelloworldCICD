package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(value = "*")
public class HelloController {

	@GetMapping(value = "/hello")
	public String getMsg() {
		return "Application is up & running...";
	}

}
