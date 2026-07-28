package com.ktdsuniversity.edu.oop.grocery;

public class Main {
	Standard chip = new Standard("포카칩", 1500);
	Standard sushi = new Fresh("참치 초밥", 4000, "2026-07-30", 8);
	Standard fruit = new Fresh("사과", 6000, "2026-08-12", 6);
	Standard icecream = new Frozen("월드콘", 2000, "2026-08-15", -5);
	Standard vivigo = new Frozen("비비고왕교자",8000, "2027-01-05", -8);
	Standard beer = new Alcohol("테라", 3500, 4, 19, 8);
	Standard soju = new Alcohol("진로", 5000, 2, 19, 14);
	
	Customer cus1 = new Normal("A", 20000, 10);
	Customer cus2 = new New("B", 15000, 21);
	Customer cus3 = new Regular("C", 20000, 30);
}
