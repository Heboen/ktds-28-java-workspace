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
	
	@Override
	public String toString() {
		return "Frozen Food - name: " + super.getName() + 
				", price: " + super.getPrice() + ", limit: " + this.limitDate + ", storageTempature: " + this.storageTemp;
	}

}
