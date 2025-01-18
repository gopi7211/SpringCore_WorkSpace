package com.entity;

import java.util.Map;

public class Shop {

	private String loc;
	private String name;
	Map<Integer, String> items;
	public Shop(String loc, String name, Map<Integer, String> items) {
		super();
		this.loc = loc;
		this.name = name;
		this.items = items;
	}
	
	public void items() {
		System.out.println("Shop  loc=" + loc + ", name=" + name + ", items=" + items + " ");
	}

	
	
}
