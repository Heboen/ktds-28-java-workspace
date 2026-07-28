package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Zoo {

//	private Penguin[] penguins;
//	private Tiger[] tigers;
//	private Giraffe[] giraffes;
//	private Animal[] animals;

	public static void enterArea(Animal animal) {
		System.out.println(animal.getSpecies() + "영역에 들어왔습니다.");
		
	}
	public static void seeAnimals(Animal animal) {
		System.out.println(animal.getSpecies() + "인 " + animal.getName() + "입니다.");
	}
	public static void Tigers(Animal animal) {
		if(animal instanceof Tiger tiger) {
			tiger.hunt();
			tiger.howl();
		}
	}
	public static void Kick(Animal animal) {
		if(animal instanceof Giraffe giraffe) {
			giraffe.kick();
		}
	}
	
	public static void Swimming(Animal animal) {
		if(animal instanceof Penguin penguin) {
			penguin.feathering();
			penguin.swim();
		}
	}
	
//	public static void Feathering(Animal animal) {
//		if(animal instanceof Penguin penguin) {
//			penguin.feathering();
//		}
//	}
	
//	public static void Hunting(Animal animal) {
//		if(animal instanceof Tiger tiger) {
//			tiger.hunt();
//		}
//	}
	
	
	
public static void main(String[] args) {
	Animal[] animals = new Animal[3];
	animals[0] = new Penguin("핑구", 3, "수컷", 15, 80, "펭귄");
	animals[1] = new Tiger("루나", 8, "암컷", 70, 170, "호랑이");
	animals[2] = new Giraffe("키링", 6, "수컷", 15, 380, "기린");
	
	for(int i = 0; i < animals.length; i++) {
		enterArea(animals[i]);
		seeAnimals(animals[i]);
		System.out.println();
		animals[i].explain();
		System.out.println();
//		Howling(animals[i]);
		Tigers(animals[i]);
		Kick(animals[i]);
		Swimming(animals[i]);
//		Feathering(animals[i]);
		animals[i].move();
		animals[i].drink();
		System.out.println();
		animals[i].eat();
		animals[i].play();
		animals[i].sleep();
		System.out.println("==========================================\n");
	}
}


}
