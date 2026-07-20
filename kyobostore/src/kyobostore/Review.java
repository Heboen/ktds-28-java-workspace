package kyobostore;

/**
 * 책의 리뷰
 */
public class Review {
	
	/**
	 * 리뷰 분류
	 */
	//책의 리뷰는 일반 독자가 작성한 리뷰와 출판사가 작성한 리뷰로 나뉨
	//타입을 나누어 출판사 리뷰인 것과 독자의 리뷰를 구분할 수 있음
	int type;
	
	/**
	 * 리뷰를 작성한 사람의 이름(닉네임)
	 */
	String name;
	
	/**
	 * 리뷰 내용
	 */
	String comment;

}
