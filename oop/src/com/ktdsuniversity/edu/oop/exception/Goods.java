package com.ktdsuniversity.edu.oop.exception;

public class Goods {
	private String name;
	private int price;
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Goods othergoods) {
			return this.name.equals(othergoods.name) && this.price == othergoods.price;
		}
		return false;
	}
	
	
}
