package com.ktdsuniversity.edu.oop.exam;

public class Car {
	
	//멤버 변수
	//클래스의 인스턴스가 '독립적'으로 가지고 있는 정보들
	boolean isEngineStart;
	int speed;
	public int zero100seconds;
	
	/**
	 * 생성자
	 */
	public Car(int zero100seconds) {
		this.zero100seconds = zero100seconds;
		System.out.println("생성자를 호출 했습니다.");
		System.out.println(this);
//		isEngineStart = true;
//		speed = 10;
		this.pressEngineStartButton();
	}
//	public Car(int zero100seconds) {
//		zero100seconds = zero100seconds;
//	}
	
	//인스턴스 메소드 (이하 메소드) 정의
	//엔진 켜기 / 끄기
	public void pressEngineStartButton() {
		//이 메소드를 호출하는 인스턴스의 isEngineStart가 false -> true / true -> false
//		isEngineStart = !isEngineStart;
		if(isEngineStart) {
			// 시동이 켜저있다면 끈다.
			isEngineStart = false;
			speed = 0;
		}
		else {
			// 시동이 꺼져있다면 켠다.
			isEngineStart = true;
			speed = 10;
		}
	}
	
	//가속 페달을 밟는다.
	//페달을 밟는 압력만큼 속도가 증가한다
	public void pressGasolinpedal(int pressure) {
		if(isEngineStart) {
			speed += pressure;
		}	
	}
	
	//브레이크 페달을 밟는다.
	//페달을 밟는 압력 만큼 속도가 감소한다.
	public void pressBrakePedal(int pressure) {
		if(isEngineStart) {
			speed -= pressure;
		}
	}
	
	
	 
	public static void main(String[] args) {
		
		//Car 클래스를 이용해 다음을 생성.
		//Car 타입의 Kona 인스턴스를 생성
		Car kona = new Car(8);
		//Car 타입의 Carnival 인스턴스를 생성
		Car carnival = new Car(7);
		
		
		
		//kona의 시동을 켠다.
//		kona.pressEngineStartButton();
		
		//브레이크 페달을 몇 차례 밟는다.
		kona.pressBrakePedal(3);
		kona.pressBrakePedal(3);
		
		//가속 페달을 3회 강하게 밟는다.
		kona.pressGasolinpedal(150);
		kona.pressGasolinpedal(150);
		kona.pressGasolinpedal(150);
		
		//브레이크 페달을 아주 강하게 밟는다.
		kona.pressBrakePedal(300);
		
		//kona의 시동을 끈다.
		kona.pressEngineStartButton();
		
		//인스턴스는 자신의 멤버변수의 값을 할당하거나 출력할 수 있다.
//		kona.isEngineStart = true;
//		kona.speed = 100;
//		
//		carnival.isEngineStart = false;
//		carnival.speed = 70;
		
		carnival.pressEngineStartButton();
		
		carnival.pressBrakePedal(5);
		carnival.pressBrakePedal(5);
		
		carnival.pressGasolinpedal(200);
		
		carnival.pressEngineStartButton();
		
		System.out.println(kona.isEngineStart);
		System.out.println(kona.speed);
		System.out.println(carnival.isEngineStart);
		System.out.println(carnival.speed);
	}
	
}
