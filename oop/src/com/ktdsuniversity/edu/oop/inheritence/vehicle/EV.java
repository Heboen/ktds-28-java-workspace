package com.ktdsuniversity.edu.oop.inheritence.vehicle;

public class EV extends Vehicle{
	
	private int battery;
	
	public EV(String name,int battery) {
		super(name);
		this.battery = battery;
	}
	
	public int getBattery() {
		return this.battery;
	}
	
	public void batteryCheck() {
		System.out.println("현재 남은 배터리: "+ this.getBattery());
	}
}
