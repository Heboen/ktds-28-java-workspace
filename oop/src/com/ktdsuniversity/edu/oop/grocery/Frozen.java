package com.ktdsuniversity.edu.oop.grocery;

/**
 * 냉동상품
 */
public class Frozen extends Standard{
	private String limitDate;
	private int storageTemp;

	public Frozen(String name, int price, String limitDate, int storageTemp) {
		super(name, price);
		this.limitDate = limitDate;
		this.storageTemp = storageTemp;
	}

	public int getStorageTemp() {
		return this.storageTemp;
	}

}
