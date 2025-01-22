package com.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class realme implements Monbile{

	@Override
	public void ring() {
		System.out.println("realame is running ");
	}

	
}
