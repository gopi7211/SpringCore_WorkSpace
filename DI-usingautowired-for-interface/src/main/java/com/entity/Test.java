package com.entity;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(config.class);
		
		Scanner s = con.getBean("scanner",Scanner.class);
		
		Employee e = con.getBean("employee",Employee.class);
	}
}
