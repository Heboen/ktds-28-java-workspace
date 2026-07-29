package com.ktdsuniversity.edu.oop.exception;

public class GoodsHolder {
	
	private Goods[] goods;
	private int goodsIndex;
	
	public GoodsHolder(int goodsCount) {
		if(goodsCount <= 0) {
//			goodsCount = 0;
			HolderInitiateException hie = new HolderInitiateException("잘못된 인덱스의 개수입니다. 0보다 큰 값을 입력하세요");
			throw hie;
		} 
		this.goods = new Goods[goodsCount];
	}

	public void addGoods(String name, String price) {
		if(price == null) { return;}
		int intPrice = 0;
		try {
			intPrice = Integer.parseInt(price);
		} catch(NumberFormatException nfe) {
			System.out.println("숫자 변환 실패: " + nfe.getMessage());
			return;
		}
		this.addGoods(name, intPrice);
	}
	
	public void addGoods(String name, int price) {
		if(name == null || name.isBlank()) {
			return;
		}
		
		if(this.goodsIndex < goods.length) {
			this.goods[this.goodsIndex++] = new Goods(name, price);
		}
	}
	
	public void removeGoods(int goodsIndex) {
		if(goodsIndex >= 0 && goodsIndex < this.goods.length) {
			this.goods[goodsIndex] = null;
		}
	}
	
	public void printGoodsAt(int index) {
//		if(0 <= index && index < this.goods.length) {
//			Goods goods = this.goods[index];
//			if(goods != null) {
//				String message = "%d. %s(%d)".formatted(index+1, goods.getName(), goods.getPrice());
//				System.out.println(message);
//			}	
//		}
		Goods goods = null;
		if (0 <= index && index < this.goods.length) {
			goods = this.goods[index];
		}

		if (goods != null) {
			String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
			System.out.println(message);
		}
	}
	
	public void printGoods() {
		for(int i = 0; i < this.goods.length; i++) {
			this.printGoodsAt(i);
		}
	}
}
