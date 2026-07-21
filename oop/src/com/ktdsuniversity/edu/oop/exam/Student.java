package com.ktdsuniversity.edu.oop.exam;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	
	
	public int getSumAllScores() {
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
