package com.gopi.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("Configure.xml");
		
		Person person = factory.getBean("myperson",Person.class);
		
		person.use();
	}
}
