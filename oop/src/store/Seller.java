package store;

/**
 * 상품 판매자
 */
public class Seller {
	/**
	 * 상품 이름
	 */
	String name;
	
	/**
	 * 상품 가격
	 */
	int price;
	
	/**
	 * 상품 재고
	 */
	int stock;
	
	/**
	 * 매출액
	 */
	int total;

	public Seller(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.total = 0;
	}
	
	public void sell(int amount) {
		if(this.stock == 0) {System.out.println("상품이 매진되었습니다.");}
		if(amount > this.stock) {
			System.out.println("상품이 " + this.stock + "개 만큼 있습니다.");
			this.total += this.stock * this.price;
			this.stock -= this.stock;
		}
		else if(amount < this.stock) {
			this.stock -= amount;
			this.total += amount*price;
		}
		
	}
	
	
}
