package com.ktdsuniversity.edu.oop.inheritence.vehicle;

public class BatMobile extends SportsCar{
	
	public BatMobile(String name) {
		super(name);
	}
	
	public void batPort() {
		System.out.println(super.getName() + " 포트 분리");
	}

}
