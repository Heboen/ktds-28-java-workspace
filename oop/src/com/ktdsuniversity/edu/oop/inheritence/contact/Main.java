package com.ktdsuniversity.edu.oop.inheritence.contact;

public class Main {
	//모든 연락처들의 이름과 전화번호를 출력하라.
	
	public static void printNameAndPhone(Contact contact) {
		System.out.println(contact.getName());
		System.out.println(contact.getPhone());
	}
	
	public static void main(String[] args) {
		
		Contact contact = new Contact("친구1", "010-1234-5678");	
//		String name = contact.getName();
//		String phone = contact.getPhone();
//		
//		System.out.println(name);
//		System.out.println(phone);
		
		printNameAndPhone(contact);
		
		contact.printContact();
		
//		EmailContact contact2 = new EmailContact();
		//이 상태는 다형성 관계가 아님
		EmailContact contact2 = new EmailContact("친구2", "010-1111-2222", "test@email.com");
//		name = contact2.getName();
//		phone = contact2.getPhone();
		String email = contact2.getEmail();
		//getEmail은 EmailContact의 메소드이기 때문에
		//Contact라는 껍데기를 얻은 contact2는 getEmail을 호출할 수 없다.
		
//		System.out.println(name);
//		System.out.println(phone);
		System.out.println(email);
		
		printNameAndPhone(contact2);
		//다형성의 is a관계로 자식클래스인 EmailContact는
		//부모클래스인 Contact에 할당되는 것이 허가된다.
		//이로 인해 함수의 파라미터의 타입이 다른 것처럼 보여도 같은 타입으로 판정됨.
		
		
		contact2.printContact();
	}
}
