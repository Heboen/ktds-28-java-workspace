package com.ktdsuniversity.edu.oop.grocery;

/**
 * 신선상품
 */
public class Fresh extends Standard{
	private String limitDate;
	private int storageTemp;

	public Fresh(String name, int price, String limitDate, int storageTemp) {
		super(name, price);
		this.limitDate = limitDate;
		this.storageTemp = storageTemp;
	}

	public int getStorageTemp() {
		return this.storageTemp;
	}

	
	

}
