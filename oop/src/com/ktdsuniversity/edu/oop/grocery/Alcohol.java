package com.ktdsuniversity.edu.oop.grocery;

/**
 * 주류
 */
public class Alcohol extends Standard{
	
	private int storageTemp;
	private int limitAge;
	private int alcoholPercent;
	
	public Alcohol(String name, int price, int storageTemp, int limitAge, int alcoholPercent) {
		super(name, price);
		this.storageTemp = storageTemp;
		this.limitAge = limitAge;
		this.alcoholPercent = alcoholPercent;
	}

	public int getStorageTemp() {
		return this.storageTemp;
	}

	public int getLimitAge() {
		return this.limitAge;
	}

	public int getAlcoholPercent() {
		return this.alcoholPercent;
	}
	
	

}
