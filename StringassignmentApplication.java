package com.codingdojo.stringassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class StringassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringassignmentApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello client, how are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great!";
	}
}
