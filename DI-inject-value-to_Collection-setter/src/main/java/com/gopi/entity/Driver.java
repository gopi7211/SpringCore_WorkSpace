package com.gopi.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("Configuration.xml");
		
		Student student = factory.getBean("mystudent",Student.class);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getSubjects());
	}
}
