package com.ktdsuniversity.edu.oop.cafe;
/**
 * 만화책
 */
public class ComicsBook {
	/** 만화책 이름*/
	private String name;
	/**만화책 대여 상태*/
	private boolean bookStatus;
	/**만화책 대여비*/
	private int bookCost;
	
	
	public ComicsBook(String name, boolean bookStatus, int bookCost) {
		this.name = name;
		this.bookStatus = bookStatus;
		this.bookCost = bookCost;
	}


	public String getName() {
		return this.name;
	}
//	public ComicsBook[] getBooks() {
//		return this.ComicsBook;
//	}

	public boolean isBookStatus() {
		return this.bookStatus;
	}

	public int getBookCost() {
		return this.bookCost;
	}
	
	public void rent() {
		this.bookStatus = true;
	}
	
	public void returnBook() {
		this.bookStatus = false;
	}

	
	

}
