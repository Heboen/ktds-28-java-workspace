package workflow;

import java.util.Scanner;

public class work_0719 {
	
	//10. 문자열 1개와 정수형 변수 1개를 파라미터로 받아, 문자열을 정수형 변수만큼 반복 출력하는 메소드.
	public static void printstrnum(String a, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(a);
		}
	}
	//11. 정수형 변수 1개를 파라미터로 받아, 해당 정수의 구구단을 출력하는 메소드.
	public static void multi(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
	
	//13. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.
	public static int re_index(int[] arr, int idx) {
		if(idx>=0 && idx < arr.length) {
			return arr[idx];
		}
		else {
			return 0;
		}
	}
	
	//14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드
	public static int re_multi3rd(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%3 == 0) {
				return arr[i];
			}
		}
		return -1;
	}
	
	//16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
	public static void print_not_in(int[] arr1, int[] arr2) {
		
		for(int i = 0; i < arr1.length; i++) {
			boolean dp = true;
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					dp = !dp;
					break;
				}
				
			}
			if(dp) {
			System.out.print(arr1[i] + " ");
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			boolean dp = true;
			for(int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					dp = !dp;
					break;
				}
				
			}
			if(dp) {
			System.out.print(arr2[i] + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {9,7,454,1,2,3};
		print_not_in(arr1, arr2);
	}

}
