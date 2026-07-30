package com.ktdsuniversity.edu.oop.generics;

import com.ktdsuniversity.edu.oop.exception.Goods;

public class PrintTest {

	public static void main(String[] args) {
		
		Print<Integer> intPrint = new Print<>(0);
		Print<Double> doublePrint = new Print<>(0d);
		Print<Long> longPrint = new Print<>(0l);
		Print<Boolean> booleanPrint = new Print<>(false);
		 
		int a = intPrint.getPrintData();
		System.out.println(a);
		double b = doublePrint.getPrintData();
		System.out.println(b);
		long c = longPrint.getPrintData();
		System.out.println(c);
		boolean d = booleanPrint.getPrintData();
		System.out.println(d);
		
		Print<Goods> goodsprint = new Print<>(new Goods("A", 1500));
		
		Goods goods = goodsprint.getPrintData();
		goodsprint.print();
		System.out.println(goods);
		
	}
	
}
