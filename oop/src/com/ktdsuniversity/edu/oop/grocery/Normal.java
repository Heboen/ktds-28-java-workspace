package com.ktdsuniversity.edu.oop.grocery;

public class Normal implements Customer{
	
	private String name;
	private int wallet;
	private Standard[] basket;
	private int age;
	public Normal(String name, int wallet, int age) {
		this.name = name;
		this.wallet = wallet;
		this.age = age;
		this.basket = new Standard[10];
	}
	public String getName() {
		return this.name;
	}
	public int getWallet() {
		return this.wallet;
	}
	public Standard[] getBasket() {
		return this.basket;
	}
	public int getAge() {
		return this.age;
	}
	
	public void purchase(Standard[] standard) {
		this.basket = standard;
		int total = 0;
		for(int i = 0; i < standard.length; i++) {
			total += standard[i].getPrice();
		}
		System.out.println("고객님의 총 구매 금액은 " + total + "원 입니다.");
	}

	
}
