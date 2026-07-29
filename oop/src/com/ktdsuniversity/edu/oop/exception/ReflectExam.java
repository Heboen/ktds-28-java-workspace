package com.ktdsuniversity.edu.oop.exception;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectExam {
	
	public static void main(String[] args) /*throws Exception*/{
		
		//Reflection : 다이나믹 로딩
		// -> 클래스, 멤버변수, 생성자, 메소드 동적로딩을 의미
		// -> 동적로딩 ==> 클래스의 도움없이 인스턴스를 생성하거나 호출하는 방법.
		
//		GoodsHolder holder = new GoodsHolder(4);
		try {
		Class holderClass = Class.forName("com.ktdsuniversity.edu.oop.exception.GoodsHolder");//클래스의 원형을 가지고 오는 메소드
		Constructor 생성자 = holderClass.getDeclaredConstructor(int.class);
		Object holder = 생성자.newInstance(4);
		System.out.println(holder);
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(NoSuchMethodException nsme) {
			nsme.printStackTrace();
		} catch(InvocationTargetException ivte) {
			ivte.printStackTrace();
		} catch(IllegalAccessException iae) {
			iae.printStackTrace();
		} catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		
	}

}
