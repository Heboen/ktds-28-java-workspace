package com.ktdsuniversity.edu.oop.arrayhome;

public class ArrayHome {
	
	public static void main(String[] args) {
		//1. 정수형 배열 변수를 만들고 값을 할당해 보세요.
		int[] arr = new int[]{2,7,16,17,36,37,38,40,41,44};
		
		//2. 정수형 배열 변수의 합을 계산해 출력해보세요
		int sum = 0;
		for(int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println("2.  " + sum);
		
		//3. 실수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.
		float[] randarr = new float[10];
		for(int i = 0; i < randarr.length; i++) {
			randarr[i] = (float)(Math.random() * 20);
		}
		
		//4. 실수형 배열 변수의 합을 계산해 출력해보세요.
		float randsum = 0;
		/*for(int i = 0; i < randarr.length; i++) {
			randsum += randarr[i];
		}*/
		for(float i : randarr) {
			randsum += i;
		}
		
		System.out.println("4.  " + randsum);
		
		//5. 실수형 배열 변수 내의 가장 큰 값을 출력해보세요 .
		float maxval = Float.MIN_VALUE;
		for(int i = 0; i < randarr.length; i++) {
			if(maxval < randarr[i]) {
				maxval = randarr[i];
			}
		}
		System.out.println("5.  " + maxval);
		
		//6. 실수형 배열 변수 내의 가장 작은 값을 출력해보세요.
		float minval = Float.MAX_VALUE;
		for(int i = 0; i < randarr.length; i++) {
			if(minval > randarr[i]) {
				minval = randarr[i];
			}
		}
		System.out.println("6.  " + minval);
		
		//7. 문자열형 배열 변수를 만들어 값을 할당해 보세요.
		String[] strarr = new String[] {"apple", "banana", "mango", "orange", "kiwi"};
		
		//8. 문자열형 배열 변수 내의 값 중 길이가 가장 긴 문자열을 출력해보세요.
		String longest = strarr[0];
		for(int i = 1; i < strarr.length; i++) {
			if(longest.length() < strarr[i].length()) {
				longest = strarr[i];
			}
		}
		System.out.println("8.  " + longest);
		
		//9. 정수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.
		int[] randint = new int[10];
		for(int i = 0; i < randint.length; i++) {
			randint[i] = (int)(Math.random() * 20);
		}
		
		//10. 정수형 배열 변수 내의 값 중 평균 이상의 값들만 출력해보세요.
		int intsum = 0;
		int avg = 0;
		for(int i : randint) {
			intsum += i;
		}
		avg /= randint.length;
		System.out.print("10.  ");
		for(int i : randint) {
			if( i >= avg) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//11. 상품을 표현하는 클래스를 만들어보세요.
		//12. 상품을 표현하는 클래스의 배열 변수를 만들어보세요.
		ExplainStuff[] exps = new ExplainStuff[5];
		exps[0] = new ExplainStuff("라면", 5000);
		exps[1] = new ExplainStuff("소세지", 3000);
		exps[2] = new ExplainStuff("삼각김밥", 1500);
		exps[3] = new ExplainStuff("빵", 2000);
		exps[4] = new ExplainStuff("콜라", 3000);
		
		//13. 상품을 표현하는 클래스의 배열 변수에서 가장 비싼 상품의 이름을 출력해보세요.
		ExplainStuff expensive = exps[0];
		for(int i = 1; i < exps.length; i++) {
			if(expensive.getPrice() < exps[i].getPrice()) {
				expensive = exps[i];
			}
		}
		System.out.println("13.  " + expensive.getName());
		System.out.println();
		
		//14. 상품을 표현하는 클래스의 배열 변수내의 모든 상품의 이름을 출력해보세요.
		System.out.print("14.  ");
		for(int i = 0; i < exps.length; i++) {
			exps[i].display();
		}
		System.out.println();
		
		//15. 숫자 형태의 문자열 배열 변수를 만들어보세요.
		String[] numstr = new String[5];
		numstr[0] = "249";
		numstr[1] = "743";
		numstr[2] = "29";
		numstr[3] = "098";
		numstr[4] = "0123";
		
		//16. 숫자 형태의 문자열 배열 변수의 값을 정수로 변환한 뒤 정수의 합과 평균을 출력해보세요.
		int strsum = 0;
		for(int i = 0; i < numstr.length; i++) {
			strsum += Integer.parseInt(numstr[i]);
		}
		System.out.println("16.  변수의 합: " + strsum + " 변수의 평균: " + strsum/numstr.length);
		
		//17. 불린 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.
		boolean[] arrboolean = new boolean[15];
		for(int i = 0; i < arrboolean.length; i++) {
			int ran = (int)(Math.random()*2);
			if(ran == 1) {
				arrboolean[i] = true;
			}
			else {
				arrboolean[i] = false;
			}
		}
		
		//18. 불린 형태의 배열 변수 내에서 true의 개수는 몇 개인지 세어 출력해보세요.
		int cnt = 0;
		for(int i = 0; i < arrboolean.length; i++) {
			if(arrboolean[i] == true) {
				cnt++;
			}
		}
		System.out.println("18.  true의 개수: "+cnt);
		
		//19. 불린 형태의 배열 변수 내에서 false가 존재하는 비율은 몇 %인지 계산해 출력해보세요.
		int falsecnt = 0;
		float ratio = 0;
		for(int i = 0; i < arrboolean.length; i++) {
			if(arrboolean[i] == false) {
				falsecnt++;
			}
		}
		ratio = ((float)falsecnt / arrboolean.length)*100;
		System.out.println("19.  false의 비율: " + ratio);
		System.out.println();
		
		//20. 문자열 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.
		String[] randstr = new String[10];
		randstr[0] = "asdfsrw";
		randstr[1] = "etxbc";
		randstr[2] = "esc";
		randstr[3] = "yiuhdts";
		randstr[4] = "vcbfhsyt";
		randstr[5] = "efrwerysdfg";
		randstr[6] = "erryuykjnb";
		randstr[7] = "aweqwedgrgcvb";
		randstr[8] = "vbdfgftuy";
		randstr[9] = "fnuysre";
		//21. 문자열 형태의 배열 변수 내의 모든 문자열의 길이를 합한 값을 계산해 출력해보세요.
		int lengthsum = 0;
		for(String s : randstr) {
			lengthsum += s.length();
		}
		System.out.println("21.  문자열 길이의 합: " + lengthsum);
	}

}
