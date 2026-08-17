package domain;

import java.time.LocalDate;
/**
 * 도서 정보
 */
public class Book {
	/** 도서명 */
	private String title;
	/** 도서 부제 */
	private String subTitle;
	/** 장르 */
	private String genre;
	/** 출판사명 */
	private String publisher;
	/** 저자 */
	private String author;
	/** 출판일 */
	private LocalDate publishing;
	/** 인쇄 회차 */
	private int printRun;
	/** 책의 가격 */
	private int price;
	/** isbn */
	private String isbn;
	
	public Book(String title, String subTitle, String genre, String publisher, String author, LocalDate publishing,
			int printRun, int price, String isbn) {
		this.title = title;
		this.subTitle = subTitle;
		this.genre = genre;
		this.publisher = publisher;
		this.author = author;
		this.publishing = publishing;
		this.printRun = printRun;
		this.price = price;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getSubTitle() {
		return this.subTitle;
	}
	public String getGenre() {
		return this.genre;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public String getAuthor() {
		return this.author;
	}
	public LocalDate getPublishing() {
		return this.publishing;
	}
	public int getPrintRun() {
		return this.printRun;
	}
	public int getPrice() {
		return this.price;
	}
	public String getIsbn() {
		return this.isbn;
	}


}
