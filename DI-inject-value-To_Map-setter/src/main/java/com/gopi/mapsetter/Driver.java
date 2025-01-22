package com.gopi.mapsetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		BeanFactory fact = new ClassPathXmlApplicationContext("my_config.xml");
		Shop p = fact.getBean("shop",Shop.class);
		System.out.println(p);
	}
}
