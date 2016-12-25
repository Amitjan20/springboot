package com.amit.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseAppApi {
	
	public static void main(String[] args) {
		SpringApplication.run(CourseAppApi.class, args);
	}
}

//Convention over configuration
//Starts spring application context
//Performs class path scan
//Starts tom cat server
//start.spring.io