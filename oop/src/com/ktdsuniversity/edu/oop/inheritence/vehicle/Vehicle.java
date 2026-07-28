package com.ktdsuniversity.edu.oop.inheritence.vehicle;

public class Vehicle {

	private String name;

	public Vehicle(String name) {
		this.name = name;
	}
	
	public void turnOn() {
		System.out.println(this.getName() + " 시동 걸기");
	}

	public String getName() {
		return this.name;
	}
	
	
	
}
