package com.ktdsuniversity.edu.oop.board.service;

/**
 * 게시판의 기능
 */
public interface ArticleService {

	void write();
	void display();
	void delete(int articlenum);
	void displayWithNum(int articlenum);
	void modifyWithNum(int articlenum);
	void articleCount();
	void replying(int articlenum);
	void deleteReply(int articlenum, int replynum);
	void recommendReply(int articlenum, int replnum);
	void searchTitle(String title);
	void clearArticle();
	void clearReply(int articlenum);
}
