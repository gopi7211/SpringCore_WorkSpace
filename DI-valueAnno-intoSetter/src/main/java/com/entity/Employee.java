package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	
	int id;
	String name;
	
	



	@Value("1")
	public void setId(int id) {
		this.id = id;
	}




	@Value("gopi")
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
