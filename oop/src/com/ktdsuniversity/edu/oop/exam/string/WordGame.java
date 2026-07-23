package com.ktdsuniversity.edu.oop.exam.string;
import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		String start = "자전거";
		System.out.println(start);
		String lastword = start;
		int cnt = 0;
		while(true) {
			int len = lastword.length();
			String last = lastword.substring(len);
			Scanner sc = new Scanner(System.in);
			System.out.println("단어 입력: ");
			String word = sc.nextLine();
			word = word.trim();
			word = word.replace(" ", "");
			if(word.startsWith(last)) {
				if(word.length() >= 3) {
					System.out.println(word);
					lastword = word;
					cnt++;
				}else {
					break;
				}
			}else {
				break;
			}	
		}
		System.out.println("이어 나간 단어 수: "+cnt);
	}
	
	/*
	 * 이 코드에서는 Scanner가 다 사용되었을때 Scanner가 사용한 메모리 공간을 null로 만듦
	 * 하지만 실제로는 메모리 데이터값이 그대로 남아있음 but 접근 불가 
	 * 그렇게 반복문에서 Scanner가 메모리 공간을 다 채워버리면 프로그램이 죽어버림 (메모리 누수)
	 * JVM에는 가비지 컬렉터가 있어 null 신호를 받아 회수되지 못한 값들을 처리하는데 이를 Finallize라고 함
	 * 
	 * 이를 막기 위해서 가급적 반복문 안에서는 변수를 만들지 않아야함
	 * 	 * */

}
