package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.cafe.ComicsBook;

/**
 * 만화 카페
 */
public class ComicsBookCafe {
	private int safe;
	private List<ComicsBook> comicsbook;
	
	public ComicsBookCafe() {
		this.comicsbook = new ArrayList<>();
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
	
	public void addBook(ComicsBook book) {
		this.comicsbook.add(book);
	}
	
	public List<ComicsBook> getComicbook() {
		return this.comicsbook;
	}
	


	public void displayBooks() {
		System.out.println("===만화책 목록===");
		for(int i = 0; i<this.comicsbook.size(); i++) {
			
			ComicsBook book = this.comicsbook.get(i);
			if(book != null) {
				String state = "대여 가능";
				if(book.isBookStatus()) {
					state = "대여 중";
				}
				System.out.println("만화잭 번호: " + i);
				System.out.println("만화책 이름: "+ book.getName());
				System.out.println("만화책 대여 상태 " + state);
				System.out.println("만화책 대여비 " + book.getBookCost() + "\n");
			}			
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
