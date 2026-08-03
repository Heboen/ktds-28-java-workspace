package com.ktdsuniversity.edu.oop.board.service;

/**
 * 게시판의 기능
 */
public interface ArticleService {

	void write();
	void display();
	void delete(int articleNum);
	void displayWithNum(int articleNum);
	void modifyWithNum(int articleNum);
	void articleCount();
	void replying(int articleNum);
	void deleteReply(int articleNum, int replyNum);
	void recommendReply(int articleNum, int replNum);
	void searchTitle(String title);
	void clearArticle();
	void clearReply(int articleNum);
}
