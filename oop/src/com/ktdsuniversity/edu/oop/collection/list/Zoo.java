package com.ktdsuniversity.edu.oop.collection.list;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.inheritence.zoo.Animal;
import com.ktdsuniversity.edu.oop.inheritence.zoo.Giraffe;
import com.ktdsuniversity.edu.oop.inheritence.zoo.Penguin;
import com.ktdsuniversity.edu.oop.inheritence.zoo.Tiger;

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
	List<Animal> animals = new ArrayList<>();
	animals.add(new Penguin("핑구", 3, "수컷", 15, 80, "펭귄"));
	animals.add(new Tiger("루나", 8, "암컷", 70, 170, "호랑이"));
	animals.add(new Giraffe("키링", 6, "수컷", 15, 380, "기린"));
	
	for(int i = 0; i < animals.size(); i++) {
		enterArea(animals.get(i));
		seeAnimals(animals.get(i));
		System.out.println();
		animals.get(i).explain();
		System.out.println();
//		Howling(animals.get(i));
		Tigers(animals.get(i));
		Kick(animals.get(i));
		Swimming(animals.get(i));
//		Feathering(animals.get(i));
		animals.get(i).move();
		animals.get(i).drink();
		System.out.println();
		animals.get(i).eat();
		animals.get(i).play();
		animals.get(i).sleep();
		System.out.println("==========================================\n");
	}
}


}
