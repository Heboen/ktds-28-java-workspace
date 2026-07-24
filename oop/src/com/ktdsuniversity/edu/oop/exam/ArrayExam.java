package com.ktdsuniversity.edu.oop.exam;

public class ArrayExam {
	public static void main(String[] args){
		//배열을 정의하고 생성하는 3가지 방법
		//1. 자료형[] 배열이름 = new 자료형[배열 길이] 
		//배열의 길이를 확정시키는 방법
		int[] nums = new int[3];
		nums[0] = 10;
		nums[2] = 20;
		nums[3] = 30;
		
		//2. 자료형[] 배열이름 = new 자료형[]{각 인덱스에 들어갈 값들]
		//값들을 먼저 확정시키는 방법
		int[] nums2 = new int[] {50,30,60,10,20,55,7,88};
		
		//3. 자료형[] 배열이름 = {각 인덱스에 들어갈 값들}
		//사용하는 방법이 제한적이다
		//지역변수에만 사용할 수 있고, 파라미터에는 사용할 수 없다
		int[] num3 = {100,200,300,400,500,200,700,10,20};
	}

}
