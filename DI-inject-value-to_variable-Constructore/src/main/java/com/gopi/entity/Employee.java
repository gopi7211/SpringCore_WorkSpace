package com.gopi.entity;

public class Employee {

	private int id;
	private String name;
	private double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void disp() {
		System.out.println(id +" "+name+" "+sal);
	}
}
