package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		Employee e =con.getBean("employee",Employee.class);
		System.out.println(e);
	}

	
}
