package com.ktdsuniversity.edu.oop.inheritence.vehicle;

public class SportsCar extends Vehicle{
	
	public SportsCar(String name) {
		super(name);
	}
	
	public void turboMode() {
		System.out.println(super.getName() + " 터보모드 전환");
	}

}
