package com.ktdsuniversity.edu.oop.collection.list;

import com.ktdsuniversity.edu.oop.cafe.ComicsBook;

public class ComicsTest {
	
	public static void main(String[] args) {
		ComicsBookCafe cafe = new ComicsBookCafe();
		cafe.addBook(new ComicsBook("만화책 1권", false, 600));
		cafe.addBook(new ComicsBook("만화책 2권", false, 600));
		cafe.addBook(new ComicsBook("만화책 3권", false, 600));
		cafe.addBook(new ComicsBook("만화책 4권", false, 600));
		cafe.addBook(new ComicsBook("만화책 5권", false, 600));
		cafe.addBook(new ComicsBook("만화책 6권", false, 600));
		
		cafe.displayBooks();
		
		Customer cus = new Customer(10000);
		cus.Rent(cafe, 0);
		cus.Rent(cafe, 1);
		cus.Rent(cafe, 2);
		cus.Rent(cafe, 3);
		
		cus.returnBook(1);
		cus.printBooks();
	}

}
