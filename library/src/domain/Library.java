package domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 도서관
 */
public class Library {
	/** 도서 목록 */
	private List<BookItem> bookList;
	/** 회원목록 */
	private List<User> users;
	
	public Library() {
		this.bookList = new ArrayList<>();
		this.users = new ArrayList<>();
	}

	public List<BookItem> getBookList() {
		return this.bookList;
	}

	public List<User> getUsers() {
		return this.users;
	}
	
	
	
}
