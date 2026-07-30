package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.grocery.Alcohol;
import com.ktdsuniversity.edu.oop.collection.list.Custom;
import com.ktdsuniversity.edu.oop.grocery.Fresh;
import com.ktdsuniversity.edu.oop.grocery.Frozen;
import com.ktdsuniversity.edu.oop.collection.list.New;
import com.ktdsuniversity.edu.oop.collection.list.Normal;
import com.ktdsuniversity.edu.oop.collection.list.Regular;
import com.ktdsuniversity.edu.oop.grocery.Standard;

public class MartTest {

	public static void main(String[] args) {
		Standard chip = new Standard("포카칩", 1500);
		Standard sushi = new Fresh("참치 초밥", 4000, "2026-07-30", 8);
		Standard fruit = new Fresh("사과", 6000, "2026-08-12", 6);
		Standard icecream = new Frozen("월드콘", 2000, "2026-08-15", -5);
		Standard vivigo = new Frozen("비비고왕교자",8000, "2027-01-05", -8);
		Standard beer = new Alcohol("테라", 3500, 4, 19, 8);
		Standard soju = new Alcohol("진로", 5000, 2, 19, 14);
		
		Normal cus1 = new Normal("A", 20000, 10);
		New cus2 = new New("B", 15000, 21);
		Regular cus3 = new Regular("C", 20000, 30);
		
		List<Standard> cus1bas = new ArrayList<>();
		List<Standard> cus2bas = new ArrayList<>();
		List<Standard> cus3bas = new ArrayList<>();
		cus1bas.add(chip);
		cus1bas.add(soju);
		cus1bas.add(vivigo);
		cus2bas.add(chip);
		cus2bas.add(fruit);
		cus2bas.add(beer);
		cus3bas.add(fruit);
		cus3bas.add(vivigo);
		cus3bas.add(soju);
		cus3bas.add(chip);
		
		cus1.purchase(cus1bas);
		cus2.purchase(cus2bas);
		cus3.purchase(cus3bas);
//		cus1.purchase({sushi, soju, vivigo});
//		cus2.purchase(new Standard[] {chip, fruit, beer});
//		cus3.purchase(new Standard[] {fruit, vivigo, chip, soju});
		
//		cus3.purchase(cus1bas);
		System.out.println(cus1);
		System.out.println(cus2);
		System.out.println(cus3);
	}
	
}
