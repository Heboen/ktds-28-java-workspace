package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.grocery.Alcohol;
import com.ktdsuniversity.edu.oop.grocery.Standard;

public class Normal implements Custom{
	
	private String name;
	private int wallet;
	private List<Standard> basket;
	private int age;
	public Normal(String name, int wallet, int age) {
		this.name = name;
		this.wallet = wallet;
		this.age = age;
		this.basket = new ArrayList<>();
	}
	public String getName() {
		return this.name;
	}
	public int getWallet() {
		return this.wallet;
	}
	public List<Standard> getBasket() {
		return this.basket;
	}
	public int getAge() {
		return this.age;
	}
	
	public void addStuff(List<Standard> standard) {
		this.basket = standard;
	}
	
	@Override
	public void purchase(List<Standard> standard) {
		int total = 0;
		Standard goods = null;
		this.basket = standard;
		for(int i = 0; i < standard.size(); i++) {
			goods = standard.get(i);
			if(goods instanceof Alcohol alcohol) {
				if(this.getAge() < 19) {
					System.out.println("미성년자는 주류 구매가 불가능합니다.");
					continue;
				}
				else {
					total += goods.getPrice();

				}
			}
			else {
				total += goods.getPrice();
			}				
		}
		System.out.println("고객님의 총 구매 금액은 " + total + "원 입니다.");
		if(this.getWallet() < total) {
			System.out.println("잔액 부족으로 구매가 불가능합니다.");
		}
		else {
			System.out.println("결제 전 잔액: " + this.getWallet());
			this.wallet -= total;
			System.out.println("결제 후 남은 금액: " + this.getWallet());
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Normal Customer: name: " + this.name + ", money: " + this.wallet + ", basket: " + this.basket
		+ ", age: " + this.age; 
	}
	
}
