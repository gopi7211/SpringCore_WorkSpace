package com.entity;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.entity")
public class config {

	@Bean(name="scanner")
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean(name = "employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		return new Student();
	}
	
}
