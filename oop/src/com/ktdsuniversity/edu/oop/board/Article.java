package com.ktdsuniversity.edu.oop.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.oop.board.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.board.exceptions.ArticleWriterException;


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


	
	
}
