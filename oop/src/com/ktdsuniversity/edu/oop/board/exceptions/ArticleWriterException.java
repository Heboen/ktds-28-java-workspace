package com.ktdsuniversity.edu.oop.board.exceptions;

/**
 * 작성자의 이름을 입력하지 않았을때 발생하는 예외
 */
public class ArticleWriterException extends RuntimeException{

	
	private static final long serialVersionUID = -3364049365546272786L;
	

	public ArticleWriterException(String message) {
		super(message);
	}

}
