package com.ktdsuniversity.edu.oop.board;


/**
 * 댓글
 */
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
	public void printReply() {
		System.out.println("댓글 작성자: " + this.writer);
		System.out.println("댓글 작성 일자: " + this.replyDate);
		System.out.println("댓글 내용: "  + this.replyDetail);
		System.out.println("추천 수: " + this.recommend + "\n");
	}
	

	

}
