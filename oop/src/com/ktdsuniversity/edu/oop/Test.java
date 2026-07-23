package com.ktdsuniversity.edu.oop;

import com.ktdsuniversity.edu.oop.exam.Car;
import com.ktdsuniversity.edu.oop.exam.Student;
public class Test {

	public static void main(String[] args) {
		
		Car test = new Car(10);
		
		Student std = new Student(1,1,1,1);
		
		test.pressEngineStartButton();
		System.out.println(test.zero100seconds);
		
	}
}

