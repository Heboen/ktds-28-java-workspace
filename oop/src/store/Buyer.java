package store;

import java.util.Scanner;
/**
 * 상품 구매자
 */
public class Buyer {
	
	/**
	 * 구매자 소지금
	 */
	int money;
	
	/**
	 * 구매자의 장바구니
	 */
	int basket;
	
	/**
	 * 구매자의 소지금을 확인
	 * @param money
	 */
	public Buyer(int money) {
		this.money = money;
		this.basket = 0;
	}
	
	/**
	 * 구매자가 상품을 구매
	 * @param items
	 */
	public void buy(Seller[] items) {
		while(this.money > 0) {
			//구매자가 상품을 구매하려는데 소지금이 남아서 다른 물건을 사려고 할 수도 있기에 while로 반복
			//단, 0원 이상일때만
			Scanner sc = new Scanner(System.in);
			System.out.println("구매하려는 물품의 번호를 입력하세요. 구매하지 않으시다면 0번을 눌러주세요.");
			
			for(int i = 0; i < items.length; i++) {
				System.out.println(i+1 + ". " + items[i].name);
			}
			int stuff = sc.nextInt();
			
			if(stuff == 0) {//구매자가 더 이상 구매하지 않을때
				break;
			}
			
			System.out.println("구매하려는 물품의 수량을 입력하세요.");
			int amount = sc.nextInt();
			
			if(this.money < items[stuff-1].price*amount) {
				System.out.println("잔액이 부족합니다.");
				continue;
			}

			else {
				int get = items[stuff-1].sell(amount);
				this.money -= items[stuff-1].price * get;
				this.basket += get;
			}
			
		}
		if(this.money == 0){
			System.out.println("잔액이 0원 입니다.");
		}

	}
	
	public static void main(String[] args) {
		Seller[] items = new Seller[4];
		
		items[0] = new Seller("진라면", 2000, 3);
		items[1] = new Seller("신라면", 3000, 7);
		items[2] = new Seller("열라면", 1400, 4);
		items[3] = new Seller("컵라면", 1000, 4);
		
		Buyer[] customer = new Buyer[3];
		customer[0] = new Buyer(10000);
		customer[1] = new Buyer(20000);
		customer[2] = new Buyer(5000);
		
		int idx = 0;
		while(idx < customer.length) {
			System.out.println(idx+1 + "번 손님");
			customer[idx].buy(items);
			idx++;
		}
		
		System.out.println("판매자 별 판매 금액");
		for(int i = 0; i < items.length; i++) {
			System.out.println(i+1 + "번 판매자: " + items[i].total);
		}
		
		System.out.println("구매자 별 남은 잔액 및 장바구니에 담은 상품 갯수\n");
		for(int i = 0; i < customer.length; i++) {
			System.out.println(i+1 + "번 구매자: " + customer[i].money);
			System.out.println(i+1 + "번 구매자: " + customer[i].basket);
		}
	}
	

}
