package com.ktdsuniversity.edu.oop.grocery;

import java.util.Arrays;

public class New implements Customer{

		private String name;
		private int wallet;
		private Standard[] basket;
		private int age;
		public New(String name, int wallet, int age) {
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
		public int getAge() {
			return this.age;
		}
		
		@Override
		public void purchase(Standard[] standard) {
			int total = 0;
			Standard goods = null;
			this.basket = standard;
			for(int i = 0; i < standard.length; i++) {
				goods = standard[i];
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
			total = (int)(total * 0.9f);
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
			return "New Customer: name: " + this.name + ", money: " + this.wallet + ", basket: " + Arrays.toString(this.basket)
			+ ", age: " + this.age; 
		}
		
}
