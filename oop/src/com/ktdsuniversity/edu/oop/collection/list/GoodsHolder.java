package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exception.Goods;

public class GoodsHolder {
	
	private List<Goods> goods;
	
	public GoodsHolder() {
		this.goods = new ArrayList<>();
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
		
		this.goods.add(new Goods(name, price));
	}
	
	public void removeGoods(int goodsIndex) {
		if(goodsIndex >= 0 && goodsIndex < this.goods.size()) {
			this.goods.remove(goodsIndex);
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
		if (0 <= index && index < this.goods.size()) {
			goods = this.goods.get(index);
		}

		if (goods != null) {
			String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
			System.out.println(message);
		}
	}
	
	public void printGoods() {
		for(int i = 0; i < this.goods.size(); i++) {
			this.printGoodsAt(i);
		}
	}
}
