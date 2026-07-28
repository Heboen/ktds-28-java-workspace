package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Animal {
	
	private String name;
	private int age;
	private String sex;
	private float weight;
	private float height;
	private String species;
//	private int type;

	public Animal(String name, int age, String sex, float weight, float height, String species) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		this.species = species;
	}
	
//	public Animal(String species,String name, int age, String sex, float weight, float height, int type) {
//		this.species = species;
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//		this.weight = weight;
//		this.height = height;
//		this.type = type;
//		
//		this.species = species;
//	}
//	
	
	public String getName() {
		return this.name;
	}


	public String getSex() {
		return sex;
	}


	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}


	public String getSpecies() {
		return species;
	}


	public int getAge() {
		return this.age;
	}
	

	public void explain() {
		System.out.printf("종: %s, 이름: %s, 나이: %d, 성별: %s, 몸무게: %f, 키: %f", 
				this.getSpecies(), this.getName(), this.getAge(), this.getSex(), this.getWeight(), this.getHeight());
		
	}
	
	public void move() {
		System.out.println(this.name + " 이동합니다.");
	}
	public void eat() {
		System.out.println(this.name + "(이)가 먹이를 먹습니다.");
		this.weight++;
	}
	public void sleep() {
		System.out.println(this.name + "(이)가 잠을 잡니다");
		}
	public void play() {
		System.out.println(this.name + "(이)가 신나게 놉니다");
	}
	public void drink() {
		System.out.println(this.name + "(는)은 물을 마십니다.");
	}
	
//	public void hunt() {
//		System.out.println(this.getName() + "(이)가 사냥을 합니다.");
//	}
//	
//	public void howl() {
//		System.out.println(this.getName() + "(이)가 울부짖습니다.");
//	}
	
}
