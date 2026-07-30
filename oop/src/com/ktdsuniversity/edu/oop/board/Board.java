package com.ktdsuniversity.edu.oop.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.oop.board.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.board.exceptions.ArticleWriterException;

public class Board implements ArticleService{
	List<Article> board;

	public Board() {
		this.board = new ArrayList<>();
	}
	
	public void addArticle(Article article) {
		this.board.add(article);
	}
	
	@Override
	public void write() {
		Scanner sc = new Scanner(System.in);
		String title, name, date, detail;
		
		System.out.println("제목을 입력해주세요>> ");

		title = sc.nextLine();
//		title.trim();
		if (title == null || title.length() > 30) {
			ArticleException ae = new ArticleException("제목의 형식이 바르지 않습니다. 최소 1글자 최대30글자까지 작성해주십시오.");
			throw ae;
		} else {
			System.out.println("이름을 입력해주세요. >>");
			name = sc.nextLine();
			if (name == null) {
				ArticleWriterException awe = new ArticleWriterException("이름을 입력하지 않았습니다.");
				throw awe;
			}
			System.out.println("작성일을 입력해주세요 >>");
			date = sc.nextLine();
			
			System.out.println("내용을 입력해주세요 >>");
			detail = sc.nextLine();
		}
		this.board.add(new Article(title, name, date, detail));
	}

	@Override
	public void delete(int idx) {
		this.board.remove(idx);
	}
	
	
}
