package store;
import java.util.Scanner;
/**
 * 상품 구매자
 */
public class Buyer {
	int money;
	String basket;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 물품의 번호를 입력하세요.");
		System.out.println();
		String stuff = sc.next();
	}
	
	public static void main(String[] args) {
		Seller[] items = new Seller[4];
		
		items[0] = new Seller("진라면", 2000, 3);
		items[1] = new Seller("신라면", 3000, 7);
		items[2] = new Seller("열라면", 1400, 4);
		items[3] = new Seller("컵라면", 1000, 4);
		
	}
	

}
