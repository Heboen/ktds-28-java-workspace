package domain;

import java.util.List;
/**
 * 회원
 */
public class User {
	/** 회원명 */
	private String name;
	/** 연락처 */
	private String phoneNumber;
	/** 벌금 */
	private long fine;
	/** 반납기간 초과 횟수 */
	private int overTimeLimit;
	/** 대여한 도서 목록 */
	private List<BookItem> rentBooks;
	
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public long getFine() {
		return this.fine;
	}
	public int getOverTimeLimit() {
		return this.overTimeLimit;
	}
	public List<BookItem> getRentBooks() {
		return this.rentBooks;
	}
	public void overDueDate() {
		this.overTimeLimit += 1;
	}
	public void addFine(long fine) {
		this.fine += fine;
	}
	
	
}
