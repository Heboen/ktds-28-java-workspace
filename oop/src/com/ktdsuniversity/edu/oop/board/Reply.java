package com.ktdsuniversity.edu.oop.board;

public class Reply {
	
	private String replyDetail;
	private String writer;
	private String replyDate;
	private int recommend;
	
	public Reply(String replyDetail, String writer, String replyDate) {
		this.replyDetail = replyDetail;
		this.writer = writer;
		this.replyDate = replyDate;
		this.recommend = 0;
	}

	public String getReplyDetail() {
		return this.replyDetail;
	}

	public String getWriter() {
		return this.writer;
	}

	public String getReplyDate() {
		return this.replyDate;
	}

	public int getRecommend() {
		return this.recommend;
	}
	
	public void replyRecommend() {
		this.recommend+=1;
	}
	
	

}
