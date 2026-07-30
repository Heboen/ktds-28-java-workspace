package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exception.Goods;

public class LIstExam {

	public static void main(String[] args) {
		
		//정수를 관리하는 리스트 생성
		//ctrl + shift + o 자동 import
		List<Integer> decimalList = new ArrayList<>();
		
		//리스트에 몇 개의 정수가 있나?
		int size = decimalList.size();
		System.out.println(size);
		
		//리스트에 정수를 하나 추가해보자
		//add는 순서대로 추가하는 메소드
		decimalList.add(1200); //0 index
		decimalList.add(2400); //1 index
		size = decimalList.size();
		System.out.println(size);
		
		//리스트의 0번 인덱스의 값을 가져온다.
		int value = decimalList.get(0);
		System.out.println(value);

		int value1 = decimalList.get(1);
		System.out.println(value1);
		
		if(decimalList.size() > 2) {
			int value2 = decimalList.get(2);
			System.out.println(value2);
		}
		
		//리스트 0번 인덱스를 삭제한다
		//리스트 0번 인덱스를 삭제하고, 해당 인덱스에 있던값을 반환시킨다.
		int removedValue = decimalList.remove(0);
		System.out.println(removedValue + " 삭제됨");
		
		//삭제한 이후의 리스트 개수 출력
		size = decimalList.size();
		System.out.println(size+ " 개 정수가 있음");
		
		//리스트 1번 인덱스를 가져온다
		value1 = decimalList.get(0);
		System.out.println(value1);
		
		//리스트에 10개의 랜덤값을 추가
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		decimalList.add(((int)(Math.random() * 1000)));
		
		System.out.println(decimalList.size() + "개 정수가 있음");
		
		
		//리스트에 있는 모든 데이터를 지워라
		decimalList.clear();
		System.out.println(decimalList.size());
		
		//리스트에 100,200,300,400,500,600 숫자를 차례대로 할당한다.
		decimalList.add(100);
		decimalList.add(200);
		decimalList.add(300);
		decimalList.add(400);
		decimalList.add(500);
		decimalList.add(600);
		
		//리스트에 100이 존재하는가?
		if(decimalList.contains(100)) {
			System.out.println("100이 존재합니다");
		}
		//리스트에 200이 존재하는가?
		if(decimalList.contains(200)) {
			System.out.println("200이 존재합니다");
		}
		//리스트에 305가 존재하는가?
		if(decimalList.contains(305)) {
			System.out.println("305가 존재합니다");
		}
		
		//리스트에 들어있는 모든 항목을 출력한다.
		//System.out.println(decimalList);
		for(int i = 0; i < decimalList.size(); i++) {
			System.out.println(i + "번째 숫자 => " + decimalList.get(i));
		}
		
		List<Goods> goodsList = new ArrayList<>();
		
		Goods newgoods = new Goods("상품1", 500);
		Goods othergoods = new Goods("상품1", 500);
		System.out.println(newgoods == othergoods); //false
		
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1==n2);//true
		
		Goods cloneGoods = othergoods;
		System.out.println(cloneGoods == othergoods);//true
		System.out.println(cloneGoods == newgoods);//false
		
		System.out.println("goods equals ==> " + newgoods.equals(othergoods));//true
		
		//goodslist에 Goods인스턴스를 추가한다
		goodsList.add(new Goods("ABC", 2000));
		//goodslist에 Goods인스턴스를 추가한다
		goodsList.add(new Goods("DEF", 7000));
		//goodslist에 Goods인스턴스를 추가한다
		goodsList.add(new Goods("GHI", 5000));
		
		//goodsList의 0번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
		System.out.println("0번째 인스턴스 => 이름: " + goodsList.get(0).getName() + " 가격: " + goodsList.get(0).getPrice());
		//goodsList의 1번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
		System.out.println("1번째 인스턴스 => 이름: " + goodsList.get(1).getName() + " 가격: " + goodsList.get(1).getPrice());
		//goodsList의 2번째 인덱스에 있는 Goods 인스턴스를 가져와 출력한다.
		System.out.println("2번째 인스턴스 => 이름: " + goodsList.get(2).getName() + " 가격: " + goodsList.get(2).getPrice());
		
		//goodsList의 모든 Goods인스턴스를 출력한다.
		for(int i = 0; i < goodsList.size(); i++) {
			System.out.println( i + "번째 인스턴스 => 이름: " + goodsList.get(i).getName() + " 가격: " + goodsList.get(i).getPrice());
		}
//		System.out.println(goodsList);
		
		//goodsList에서 상품의 이름이 "ABC" 이고 가격이 2000인 상품이 있는가?
		boolean haveGoods = goodsList.contains(new Goods("ABC", 2000));
		System.out.println(haveGoods);
	}
	
}
