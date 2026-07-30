package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import restaurant.Drink;
import restaurant.Food;

/**
 * 식당
 */
public class Restaurant {
	
	/** 레스토랑이 판매하는 음식들*/
	private List<Food> foods;
	
	/** 레스토랑이 판매하는 주류들 */
	private List<Drink> drinks;
	
	
	public Restaurant(Food[] food, Drink[] drinks) {
		this.foods = new ArrayList<>();
		this.drinks = new ArrayList<>();
	}
	
	//음식 종류 출력
	public void displayFood() {
		for(int i =0; i < foods.size(); i++) {
			System.out.println(i + ". " + foods.get(i).getFood());
		}
	}
	
	//주류 종류 출력
	public void displayDrink() {
		for(int i =0; i < drinks.size(); i++) {
			System.out.println(i + ". " + drinks.get(i).getAlcohol());
		}
	}
	
}
