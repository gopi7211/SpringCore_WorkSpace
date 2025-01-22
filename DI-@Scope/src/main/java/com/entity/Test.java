package com.entity;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(config.class);
		
		Scanner s = con.getBean("scanner",Scanner.class);
		
		Employee e =con.getBean("employee",Employee.class);
		
		Student stu = con.getBean("student",Student.class);
		Student stu2 = con.getBean("student",Student.class);
		
//		System.out.println("Scanner Object "+s);
//		System.out.println("Employee Object"+e);
		System.out.println("Student Object "+stu2);
		System.out.println("Student Object "+stu);
		
		
	}

	
}
