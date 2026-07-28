package com.ktdsuniversity.edu.oop.grocery;

/**
 * 일반상품
 */
public class Standard{
	private String name;
	private int price;

	public Standard(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "Standard Food - name: " + this.name + ", price: " + this.price;
	}

}
