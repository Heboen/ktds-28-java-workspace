package domain;

import java.time.LocalDate;
/**
 * 관리하는 책의 정보
 */
public class BookItem {
	/** 책의 정보 */
	private Book book;
	/** 관리 고유번호 */
	private String manageNum;
	/** 대여 횟수 */
	private int rentedCount;
	/** 대여 상태 */
	private boolean rented;
	/** 대여 일자 */
	private LocalDate rentedDate;
	/** 반납 상태 */
	private boolean returned;
	/** 반납 일자 */
	private LocalDate returnDate;
	/** 대여한 회원 */
	private User rentedUser;
	
	public BookItem(Book book, int manageNum) {
		this.book = book;
		this.manageNum = Integer.toString(manageNum);
	}
	
	public Book getBook() {
		return this.book;
	}
	public String getManageNum() {
		return this.manageNum;
	}
	public int getRentedCount() {
		return this.rentedCount;
	}
	public boolean isRented() {
		return this.rented;
	}
	public LocalDate getRentedDate() {
		return this.rentedDate;
	}
	public boolean isReturned() {
		return this.returned;
	}
	public LocalDate getReturnDate() {
		return this.returnDate;
	}
	public User getRentedUser() {
		return this.rentedUser;
	}
	public void setRentedCount(int rentedCount) {
		this.rentedCount = rentedCount;
	}
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	public void setRentedDate(LocalDate rentedDate) {
		this.rentedDate = rentedDate;
	}
	public void setReturned(boolean returned) {
		this.returned = returned;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public void setRentedUser(User rentedUser) {
		this.rentedUser = rentedUser;
	}
	
	
	
}
