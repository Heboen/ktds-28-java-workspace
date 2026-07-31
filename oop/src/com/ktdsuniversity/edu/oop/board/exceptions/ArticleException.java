package com.ktdsuniversity.edu.oop.board.exceptions;

/**
 * 게시글 제목을 작성하지 않았을 때 발생하는 예외
 */
public class ArticleException extends RuntimeException{

	
	private static final long serialVersionUID = 5946227492440919408L;
	
	public ArticleException(String message) {
		super(message);
	}

}
