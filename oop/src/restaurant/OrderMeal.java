package restaurant;

import java.util.Scanner;

/**
 * 메인
 */
public class OrderMeal {
	public static void main(String[] args) {
		Food[] foods = new Food[4];
		foods[0] = new Food("육고기", 25);
		foods[1] = new Food("채소", 13);
		foods[2] = new Food("과일", 13);
		foods[3] = new Food("생선", 7);

		Drink[] drinks = new Drink[4];
		drinks[0] = new Drink("소주", 17);
		drinks[1] = new Drink("맥주", 6);
		drinks[2] = new Drink("위스키", 8);
		drinks[3] = new Drink("꼬냑", 40);

		Restaurant dining = new Restaurant(foods, drinks);

		System.out.println("몇명이서 입장하시나요?");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Customer[] customer = new Customer[num];

		int i = 0;
		while (i < num) {// 손님 나이 및 부모 동반 여부 입력
			System.out.println(i + 1 + "번 손님 나이를 입력해주세요");
			int age = sc.nextInt();
			if (age < 19 && num > 1) {
				System.out.println("부모 동반 여부 예: 1 / 아니오: 0");
				int ans = sc.nextInt();
				if (ans == 1) {
					customer[i] = new Customer(age, true);
				} else {
					customer[i] = new Customer(age, false);
				}
			} else {
				customer[i] = new Customer(age, false);
			}

			i++;
		}
		dining.displayFood(); //음식 목록 출력
		//음식 주문 확인
		customer[0].orderFood(foods[0]);
		customer[0].displayStatus();//음식 1회 주문 후 상태 확인
		
		customer[0].orderFood(foods[1]);
		customer[0].orderFood(foods[2]);
		customer[0].orderFood(foods[3]);
		customer[0].orderFood(foods[0]);
		customer[0].displayStatus();

		
		//현재 상태
		
		//주류 목록 출력
		
		customer[0].orderDrink(drinks[0]);
		customer[0].displayStatus(); //주류 주문 1회 주문 후 상태 확인
		
		customer[0].orderDrink(drinks[1]);
		customer[0].orderDrink(drinks[2]);
		customer[0].orderDrink(drinks[3]);
		customer[0].displayStatus();
		
		
//		
//		customer[0].orderDrink(drinks[0]);
//		
//		customer[0].orderFood(foods[0]);
//		customer[0].orderFood(foods[2]);
//		customer[0].displayStatus();
//		
//		customer[0].orderFood(foods[3]);
//		customer[0].orderFood(foods[0]);
//		
	}

}
