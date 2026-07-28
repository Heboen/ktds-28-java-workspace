package com.ktdsuniversity.edu.oop.inheritence.vehicle;

public class Main {
	public static void EngineStart(Vehicle vehicle) {
		vehicle.turnOn();
	}
//	public static void turbo(SportsCar car) {
//		car.turboMode();
//	}
	public static void EjectPort(BatMobile car) {
		car.batPort();
	}
//	public static void BatteryCheck(EV car) {
//		car.batteryCheck();
//	}
	public static void turbo(Vehicle car) {
		if(car instanceof SportsCar sportscar) {
			sportscar.turboMode();
		}
	}
	public static void EjectPort(Vehicle car) {
		//car로 전달된 인스턴스의 타입이 BatMobil이라면
		//EjectPort를 실행시켜라
		if(car instanceof BatMobile batmobile) {
			batmobile.batPort();
		}
	}
	public static void BatteryCheck(Vehicle car) {
		if(car instanceof EV ev) {
			ev.batteryCheck();
		}
		
	}
	

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Vehicle("클래식 카");
		vehicles[1] = new SportsCar("스포츠 카");
		vehicles[2] = new EV("EV5", 100);
		vehicles[3] = new BatMobile("배트모빌");
		vehicles[4] = new BatMobile("배트카");
		
		for(int i = 0; i < vehicles.length; i++) {
			EngineStart(vehicles[i]);
			EjectPort(vehicles[i]);
			turbo(vehicles[i]);
			BatteryCheck(vehicles[i]);
		}
			
//		Vehicle vehicle = new Vehicle("클래식");
//		
//		EV ev6 = new EV("Ev6", 90);
//		Vehicle ev5 = new EV("Ev5", 100);
//		
//		Vehicle lambo = new SportsCar("Lambo");
//		SportsCar porche = new SportsCar("Porche");
//		
//		Vehicle bat = new BatMobile("배트카");
//		SportsCar bat2 = new BatMobile("배트카2");
//		BatMobile batmobile = new BatMobile("배트모빌");
//		
//		EngineStart(vehicle);
//		
//		EngineStart(lambo);
//		EngineStart(porche);
//		
//		EngineStart(ev5);
//		EngineStart(ev6);
//		
//		EngineStart(bat);
//		EngineStart(bat2);
//		EngineStart(batmobile);
//		
////		BatteryCheck((EV) ev5);
//		BatteryCheck(ev5);
//		BatteryCheck(ev6);		
//		
////		turbo((SportsCar) lambo);
//		turbo(lambo);
//		turbo(porche);	
//		
////		turbo((SportsCar) bat);
//		turbo(bat);
//		turbo(bat2);	
//		turbo(batmobile);
//		
//		EjectPort(batmobile);
////		EjectPort((BatMobile)bat);
////		EjectPort((BatMobile)bat2);
//		EjectPort(bat);
//		EjectPort(bat2);
//		
	}
}
