package com.entity;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private List<String> teachers;
	
	
	
	
	public Student(int id, String name, List<String> teachers) {
		super();
		this.id = id;
		this.name = name;
		this.teachers = teachers;
	}




	public void disp() {
		System.out.println(name +" "+id+" "+teachers);
	}
}
