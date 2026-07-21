package kyobostore;

//import java.util.Date;

/**
 * 도서 판매 쇼핑몰 사이트의 책
 */
public class Book {
	
	/**
	 * 책 이름
	 */
	String name;
	
	/**
	 * 책 소개
	 */
	String intro;
	
	/**
	 * 책 목차
	 */
	String content;
	
	/**
	 * 보여주고 싶은 책의 내용 일부(페이지 상 책 속으로 부분)
	 */
	String clip;
	
	/**
	 * 책의 가격
	 */
	int price;
	
//	/**
//	 * 책 발행 일자
//	 */
//	Date publish;
//	
	
	public void purchase(String bookname) {
		System.out.println(bookname + "구매 " + price + "원 입니다.");
	}

}
