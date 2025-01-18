package com.gopi.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		BeanFactory fact = new ClassPathXmlApplicationContext("configure.xml");
		Car car = fact.getBean("mycar",Car.class);
		car.run();
	}
}
