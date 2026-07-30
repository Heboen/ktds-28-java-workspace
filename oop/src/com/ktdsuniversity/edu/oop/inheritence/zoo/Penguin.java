package com.ktdsuniversity.edu.oop.inheritence.zoo;


public class Penguin extends Animal{
	
	public Penguin(String name, int age, String sex, float weight, float tall, String species) {
		super(name,age,sex,weight,tall,species);
	}
	
	public void swim() {
		System.out.println(super.getName() + " 수영함 ");
	}
	
	public void feathering() {
		System.out.println(super.getName() + "(이)가 날개짓을 합니다.");
	}
}
