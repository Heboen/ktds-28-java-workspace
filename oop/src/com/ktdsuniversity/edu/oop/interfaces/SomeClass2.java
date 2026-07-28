package com.ktdsuniversity.edu.oop.interfaces;

public class SomeClass2 implements SomeInterface{

	@Override
	public void doSomething1() {
		System.out.println("무언가 할지도?1");
		System.out.println("무언가 할지도?2");
		System.out.println("무언가 할지도?3");
	}
	

	@Override
	public void doSomething2() {
		System.out.println("무언가 할지도?4");
		System.out.println("무언가 할지도?5");
		System.out.println("무언가 할지도?6");
	}

	@Override
	public void doSomething3() {
		System.out.println("무언가 할지도?7");
		System.out.println("무언가 할지도?8");
		System.out.println("무언가 할지도?9");
	}

	@Override
	public int getSomething() {
		return 5234;
	}

	@Override
	public String getString() {

		return "ㅣㅏㅁㅇ";
	}
	

}
