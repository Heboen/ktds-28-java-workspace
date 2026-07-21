package workflow;

import java.util.Scanner;
public class work_0716 {
	
	public static void op(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
	public static boolean isOdd(int a) {
		if(a % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void maxnum(int a, int b, int c) {
		System.out.println(Math.max(a, Math.max(b, c)));
	}
	
	public static boolean isPrime(int b) {
		int cnt = 0;
		for(int i = 1; i <= b/2; i++) {
			if(b%i == 0) {
				cnt++;
			}
		}
		if(2 <= cnt) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		op(a,b);
		System.out.println(isOdd(c));
		maxnum(a, b, c);
		System.out.println(isPrime(b));
		
		
		
	}

}
