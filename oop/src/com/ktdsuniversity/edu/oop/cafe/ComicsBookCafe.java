package com.ktdsuniversity.edu.oop.cafe;
/**
 * 만화 카페
 */
public class ComicsBookCafe {
	private int safe;
	private ComicsBook[] comicsbook;
	
	public ComicsBookCafe(ComicsBook[] books) {
		this.comicsbook = books;
	}
	
	
//	public ComicsBookCafe(int safe, ComicsBook[] comicsbook) {
//		this.safe = safe;
//		this.comicsbook = comicsbook;
//	}
//
//
//	public int getSafe() {
//		return safe;
//	}
//
	public ComicsBook[] getComicbook() {
		return comicsbook;
	}
	


	public void displayBooks() {
		System.out.println("===만화책 목록===");
		for(int i = 0; i<this.comicsbook.length; i++) {
			
			ComicsBook book = this.comicsbook[i];
			String state = "대여 가능";
			if(book.isBookStatus()) {
				state = "대여 중";
			}
			System.out.println("만화잭 번호: " + i);
			System.out.println("만화책 이름: "+ book.getName());
			System.out.println("만화책 대여 상태 " + state);
			System.out.println("만화책 대여비 " + book.getBookCost());
			
			
		}
	}
	
	public void takeRentfee(int fee) {
		this.safe += fee;
	}
	
//	public void setComicbook(ComicsBook comicbook,String name, boolean status, int cost,int idx) {
////		this.comicsbook[idx].setName(name);
////		this.comicsbook[idx].setBookCost(cost);
////		this.comicsbook[idx].setBookStatus(status);
//	}
	
////	public void rentalbook(ComicsBook comicbook) {
////		this.comicbook
//	}
	

}
