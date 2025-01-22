package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier(value="realme")
	Monbile mobile;
	
	public void use() {
		System.out.println("using mobile phone ");
		mobile.ring();
	}

}
