package com.ktdsuniversity.edu.oop.vendingmachine;

import java.util.Scanner;
/**
 * 자판기
 * 음료가 들어있는 자판기에 돈을 넣고 음료의 번호를 입력하면
 * 음료가 추출된다
 * 거스름돈이 남았을 경우 사용자에게 돌려준다.
 */
public class VendingMachine {
	ItemHolder holder;

	public VendingMachine(ItemHolder holder) {
		this.holder = holder;
	}
	
	public void addNewItem(int index, Item newItem) {
		this.holder.items[index] = newItem;
	}
	
	public void vending() {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		System.out.println("원하는 물품의 번호를 입력하세요.");
		System.out.println("1: 레쓰비  2: 코카콜라  3: 신라면  4: 진라면");
		String num = sc.next();
		int idx = Integer.parseInt(num);
		if(money < this.holder.items[idx-1].price) {
			System.out.println("금액이 부족합니다.");
		}
		else {
			money -= this.holder.items[idx-1].price;
			System.out.println(this.holder.items[idx-1].itemName);
			System.out.println(money);	
		}
		
	}
	
	public static void main(String[] args) {
//		Item coffee = new Item("1", "레쓰비", 800, 20);
//		Item coke = new Item("2", "코카콜라", 2000, 10);
//		Item shin = new Item("3", "신라면", 1500, 20);
//		Item jin = new Item("4", "진라면", 1500, 15);
//		Item[] items = {coffee, coke, shin, jin};
		
		Item[] items = new Item[10];
		items[0] = new Item("1", "레쓰비", 800, 20);
		items[1] = new Item("2", "코카콜라", 2000, 10);
		items[2] = new Item("3", "신라면", 1500, 20);
		items[3] = new Item("4", "진라면", 1500, 15);
		
		ItemHolder IH = new ItemHolder(items);
		
		VendingMachine VM = new VendingMachine(IH);
		
		VM.addNewItem(4, new Item("5", "진라면 약간매운맛", 2000, 3));
		
		VM.vending();
		
//		Item[] 라면들 = new Item[3];
//		라면들[0] = new Item("ITEM-1", "진라면 매운맛", 4800, 5);
//		라면들[1] = new Item("ITEM-2", "진라면 순한맛", 4300, 3);
//		라면들[2] = new Item("ITEM-3", "불닭 매운면", 4800, 7);
//		
//		ItemHolder 라면홀더 = new ItemHolder(라면들);
//		VendingMachine 한강라면 = new VendingMachine(라면홀더);
//		한강라면.addNewItem(3, new Item("ITEM-4", "진라면 약간매운맛", 4800, 2));
//		
		
	}
	
	
}
