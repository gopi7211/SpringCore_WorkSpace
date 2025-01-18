package com.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		BeanFactory fact = new ClassPathXmlApplicationContext("my_config.xml");
		Student p = fact.getBean("mystudent",Student.class);
		
		p.disp();
	}
}
