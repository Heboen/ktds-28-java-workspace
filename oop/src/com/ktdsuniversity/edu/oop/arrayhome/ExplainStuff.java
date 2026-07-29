package com.ktdsuniversity.edu.oop.arrayhome;
/**
 * 11. 상품을 표현하는 클래스를 만들어보세요.
 */
public class ExplainStuff {
	private String name;
	private int price;
	
	public ExplainStuff(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void display() {
		System.out.print(this.getName() + " ");
	}

}
