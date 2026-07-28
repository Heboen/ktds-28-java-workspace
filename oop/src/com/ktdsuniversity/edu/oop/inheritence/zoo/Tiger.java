package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Tiger extends Animal{

	public Tiger(String name, int age, String sex, float weight, float tall, String species) {
		super(name, age, sex, weight, tall, species);
	}
	public void hunt() {
		System.out.println(super.getName() + "(이)가 사냥을 합니다.");
	}
	
	
	public void howl() {
		System.out.println(super.getName() + "(이)가 울부짖습니다.");
	}
}
