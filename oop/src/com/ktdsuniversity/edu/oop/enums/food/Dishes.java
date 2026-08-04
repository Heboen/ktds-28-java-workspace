package com.ktdsuniversity.edu.oop.enums.food;

public class Dishes {
	
	public static void main(String[] args) {
		Food bigmac = new Food("빅맥", 900, FoodType.FASTFOOD);
		System.out.println(bigmac);
		
		Food tuna = new Food("참치", 2000, FoodType.FISH);	
		System.out.println(tuna);
		
		Food fillet = new Food("안심", 3000, FoodType.MEET);
		System.out.println(fillet);
		
		Food onion = new Food("양파", 300, FoodType.VEGETABLE);
		System.out.println(onion);
		
		Food banana = new Food("바나나", 400, FoodType.FRUIT);
		System.out.println(banana);
	}

}
