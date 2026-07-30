package com.ktdsuniversity.edu.oop.inheritence.zoo;


public class Giraffe extends Animal {
	
	public Giraffe(String name, int age, String sex, float weight, float tall, String species) {
		super(name, age, sex, weight, tall, species);
	}
	public void kick() {
		System.out.println(super.getName() + "(이)가 발로 찹니다.");
	}

}
