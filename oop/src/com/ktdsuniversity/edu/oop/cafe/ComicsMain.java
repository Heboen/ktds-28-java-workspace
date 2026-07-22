package com.ktdsuniversity.edu.oop.cafe;
//import java.util.Scanner;
public class ComicsMain {
	
	public static void main(String[] args) {
//		ComicsBook[] comicbooks = new ComicsBook[5];
//		comicbooks[0] = new ComicsBook("슬램덩크", false, 2000);
//		comicbooks[1] = new ComicsBook("원피스", false, 3000);
//		comicbooks[2] = new ComicsBook("그리스로마신화", false, 1000);
//		comicbooks[3] = new ComicsBook("내일은 실험왕", false, 1500);
//		comicbooks[4] = new ComicsBook("나루토", false, 2000);
//		
//		ComicsBookCafe bookcafe = new ComicsBookCafe(20000, comicbooks);
//		
//			
//		for(int i = 0; i < bookcafe.getComicbook().length; i++) {
//			System.out.println((i+1) +". "+bookcafe.getComicbook()[i].getName());
//			
//		}
//		
//		Customer cs = new Customer(bookcafe.getComicbook().length,10000);
//		int num = 0;
//		boolean status = false;
//		status = cs.Rental(bookcafe.getComicbook()[num],num);
//		if(status) {
//			cs.ReturnBook(bookcafe.getComicbook()[num],num);
//		}
		
		ComicsBook[] books = new ComicsBook[3];
		books[0] = new ComicsBook("슬램덩크 1권", false, 500);
		books[1] = new ComicsBook("슬램덩크 2권", false, 500);
		books[2] = new ComicsBook("슬램덩크 3권", false, 500);
		
		ComicsBookCafe playtoon = new ComicsBookCafe(books);
		Customer me = new Customer(4000);
		Customer other = new Customer(50000);
		
		//플레이툰이 보유중인 만화책 목록을 노출시킨다.
		playtoon.displayBooks();
		//me 고객이 플레이툰에서 슬램덩크 1권을 빌린다.
		me.Rent(playtoon, 0); //customer.books[0] 만화책 정보 할당
		//me 고객이 플레이툰에서 슬램덩크 3권을 빌린다.
//		me.Rent(playtoon, 2); //customer.books[1] 만화책 정보 할당
		//other 고객이 플레이툰에서 슬램덩크 3권을 빌린다.
//		other.Rent(playtoon,2);
//		 me 고객이 슬램덩크 1권을 반납한다.
//		me.returnBook(playtoon, 0);
////		
//		me.printBooks();
////		
//		other.printBooks();
		
		
	}

}
