package com.entity;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
	
}
