package com.gopi.entity;

public class Car {

	Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public void run() {
		System.out.println("Car is running");
		engine.start();
	}
}
