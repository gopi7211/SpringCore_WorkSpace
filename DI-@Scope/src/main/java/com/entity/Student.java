package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("sneha")
	private String name;
	
	@Value("9")
	private int id;
}
