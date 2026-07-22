package com.ktdsuniversity.edu.oop.cafe;

public class Customer {
//	private String[] bookname;
	private int wallet;
	private ComicsBook[] books;
	
	public Customer(int wallet) {
		this.books = new ComicsBook[10];
		this.wallet = wallet;
	}

	public void Rent(ComicsBookCafe cafe, int bookId) {
		// cafe가 소지하고 있는 0번 인덱스의 만화책이 대여 중인가?
		ComicsBook[] cafeBooks = cafe.getComicbook();
		
		if(bookId < 0 || bookId >= cafeBooks.length) {
			System.out.println("존재하지 않는 만화잭입니다.");
		}
		
		ComicsBook book = cafeBooks[bookId];

		// playtoon이 소지 중인 "슬램덩크 1권" 이 대여 중인가?
		if (book.isBookStatus()) {
			System.out.println("이미 대여중인 책입니다.");
		} else {

//			고객이 대여한 책 목록에 추가한다.
			int fee = book.getBookCost();
			if (fee <= this.wallet) {

				for (int i = 0; i < this.books.length; i++) {
					if (this.books[i] == null) {
						this.books[i] = book;

						this.wallet -= fee;
						cafe.takeRentfee(fee);
						book.rent();
						break;
					}
				}
			}else {
				System.out.println("대여비가 모자랍니다.");
			}
		}
	}
	
	public void returnBook(int bookId) {
		
		//고객이 반납할 책
		ComicsBook book = this.books[bookId];
		
		//책의 대여상태를 false로 변경
		if (book != null) {
			book.returnBook();
		}
		//고객이 대여한 책을 목록에서 제거
		this.books[bookId] = null;
	}
	
	public void printBooks() {
		System.out.println("고객이 대여한 책 목록");
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] != null) {
				System.out.println("만화책 번호: " + i);
				System.out.println("만화책 이름: " + this.books[i].getName());
			}
		}
	}

//	public Customer(int length,int wallet) {
//		this.bookname = new String[length];
//		this.wallet = wallet;
//	}
	
//	public boolean Rental(ComicsBook comicbook, int num) {
//		
//		if(this.wallet < comicbook.getBookCost()) {
//			System.out.println("잔액이 부족합니다.");
//			return false;
//		}
//		
//		if(this.bookname[num] == null) {
//			this.bookname[num] = comicbook.getName();
//			this.wallet -= comicbook.getBookCost();
//			return true;
//		}
//		else if(this.bookname[num] == comicbook.getName()) {
//			System.out.println("이미 대여한 책은 대여하실 수 없습니다.");
//			return true;
//		}
//		return false;
//		
////		this.bookname[num] = comicbook.getName();
////		this.wallet -= comicbook.getBookCost();
//	}
//	
//	public void ReturnBook(ComicsBook comicbook, int num) {
//		if(this.bookname[num] != null) {
//			this.bookname[num] = null;
//			System.out.println("반납 완료");
//		}
//		else {
//			System.out.println("대여하신적이 없는 책입니다.");
//		}
//	}

	
}
