package restaurant;
import java.util.Scanner;
/**
 * 식당
 */
public class Restaurant {
	
	/** 레스토랑이 판매하는 음식들*/
	private Food[] foods;
	
	/** 레스토랑이 판매하는 주류들 */
	private Drink[] drinks;
	
	
	public Restaurant(Food[] food, Drink[] drinks) {
		this.foods = food;
		this.drinks = drinks;
	}
	
	//음식 종류 출력
	public void displayFood() {
		for(int i =0; i < foods.length; i++) {
			System.out.println(i + ". " + foods[i].getFood());
		}
	}
	
	//주류 종류 출력
	public void displayDrink() {
		for(int i =0; i < drinks.length; i++) {
			System.out.println(i + ". " + drinks[i].getAlcohol());
		}
	}
	
}
