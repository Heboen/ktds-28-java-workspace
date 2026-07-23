package com.ktdsuniversity.edu.oop.exam;

public class Student {
	private int java;
	private int python;
	private int cpp;
	private int csharp;
	
	public Student() {
//		this.java = 100;
//		this.python = 100;
//		this.cpp = 100;
//		this.csharp = 100;
		//생성자 내부에서는 다른 생성자를 호출할 수 있음 -> this();
		this(100,100,100,100);
	}
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	
	
	private int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	public double getAverage(int sumscore) {
		int avg = (int)(((double)sumscore / 4) * 100);
		return (double)avg/100;
		
		/*
		 * return sumscore / 4d;
		 */
	}
	
	public double getCourseCredit(double avg) {
		int cred = (int)(((avg - 55)/10) * 100);
		return (double)cred /100;
		
		/*if(avg < 55) {
		 * 	return 0.1;
		 * }
		 * return (avg-55)/100;
		 */
	}
	
	public String getABCDF(double cred) {
		String sco = "";
		if(4.1 <= cred ) {
			sco = "A+";
		}
		else if(3.6 <= cred && cred < 4.1) {
			sco = "A";
		}
		else if(3.1 <= cred && cred < 3.6) {
			sco = "B+";
		}
		else if(2.6 <= cred && cred < 3.1) {
			sco = "B";
		}
		else if(1.6 <= cred && cred < 2.6) {
			sco = "C";
		}
		else if(0.6 <= cred && cred < 1.6) {
			sco = "D";
		}
		else if(cred < 0.6) {
			sco = "F";
		}
		return sco;
	}
	
	public static void main(String[] args) {
		Student std = new Student(100,90,80,70);
		
		Student kim = new Student(); //모든 점수가 100점인 학생 인스턴스
		
//		std.java = 85;
//		std.cpp = 80;
//		std.csharp = 80;
//		std.python = 90;
		
		
		int sum = std.getSumAllScores();
		double avg = std.getAverage(sum);
		double avc = std.getCourseCredit(avg);
		String cred = std.getABCDF(avc);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avc);
		System.out.println(cred);
	}

}
