package com.ktdsuniversity.edu.oop.board.datas;

import java.util.ArrayList;
import java.util.List;

/**
 * 게시글
 */
public class Article{
	private String title;
	private String writer;
	private String postdate;
	private int view;
	private String details;
	private List<Reply> reply;
	
	public Article(String title, String writer, String postdate, String details) {
		this.title = title;
		this.writer = writer;
		this.postdate = postdate;
		this.view = 0;
		this.details = details;
		this.reply = new ArrayList<>();
	}

	public String getTitle() {
		return this.title;
	}

	public String getWriter() {
		return this.writer;
	}

	public String getPostdate() {
		return this.postdate;
	}

	public int getView() {
		return this.view;
	}

	public String getDetails() {
		return this.details;
	}

	public List<Reply> getReply() {
		return this.reply;
	}

	public void readArticle() {
		this.view += 1;		
	}
	public void modify(String modtitle, String detail) {
		this.title = modtitle;
		this.details = detail;
	}
	
	public void addReply(Reply repl) {
		this.reply.add(repl);
	}
	public void printArticle() {
		
		System.out.println("제목: " + this.getTitle());
		System.out.println("작성자: " + this.getWriter());
		System.out.println("작성일: " + this.getPostdate());
		System.out.println("내용: " + this.getDetails());
		System.out.println("조회수: " + this.getView() + "\n");
		System.out.println("=".repeat(5)+"댓글"+"=".repeat(5));
		for (int i = 0; i < this.getReply().size(); i++) {
			this.getReply().get(i).printReply();
		}
	}
	
	

	
}
