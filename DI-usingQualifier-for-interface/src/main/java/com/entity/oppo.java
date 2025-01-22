package com.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class oppo implements Monbile{

	@Override
	public void ring() {
		System.out.println("oppo is running ");
		
	}

}
