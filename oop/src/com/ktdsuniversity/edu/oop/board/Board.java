package com.ktdsuniversity.edu.oop.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.oop.board.datas.Article;
import com.ktdsuniversity.edu.oop.board.datas.Reply;
import com.ktdsuniversity.edu.oop.board.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.board.exceptions.ArticleWriterException;
import com.ktdsuniversity.edu.oop.board.service.ArticleService;

/**
 * 게시판
 */
public class Board implements ArticleService {
	private List<Article> board;
	Scanner sc = new Scanner(System.in);

//	public static final Scanner CONSOLE;
//	static {
//		CONSOLE = new Scanner(System.in);
//	}
	public Board() {
		this.board = new ArrayList<>();
	}

	/** 게시글 추가 */
	public void addArticle(Article article) {
		if (article != null) {
			this.board.add(article);
		}
	}

	/** 날짜 형식 검증 */
	private String validate(String date) {

		if (!date.matches("\\d{4}\\-(0?[1-9]|1[012])\\-(0?[012][0-9]|3[01])")) {
			System.out.println("날짜의 형식이 알맞지 않습니다. 다시 입력해주세요");
			System.out.print("YYYY-MM-DD >> ");
			date = sc.nextLine();
			return validate(date);
		}
		return date;
	}

	/** 게시글 작성하기() */
	@Override
	public void write() {

		String title, name, date, detail;

		System.out.print("제목을 입력해주세요>> ");

		title = sc.nextLine();
		title = title.trim();
		if (title.isBlank() || title.length() > 30) {
			ArticleException ae = new ArticleException("제목의 형식이 바르지 않습니다. 최소 1글자 최대30글자까지 작성해주십시오.");
			throw ae;
//			throw new ArticleException("제목의 형식이 바르지 않습니다. 최소 1글자 최대 30글자까지 작성해주십시오.");
		}
		System.out.print("이름을 입력해주세요. >>");
		name = sc.nextLine();
		name = name.trim();
		if (name.isBlank()) {
			ArticleWriterException awe = new ArticleWriterException("이름을 입력하지 않았습니다.");
			throw awe;
		}
		System.out.println("작성일을 입력해주세요");
		System.out.print("YYYY-MM-DD >>");
		date = sc.nextLine();
		date = validate(date);

		System.out.println("내용을 입력해주세요 >>");
		detail = sc.nextLine();

		this.board.add(new Article(title, name, date, detail));
	}

	/** 원하는 게시글 */
	@Override
	public void delete(int articleNum) {
		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("존재하지 않은 게시글입니다.");
			return;
		}
		if (this.board.get(articleNum) != null) {
			this.board.get(articleNum).getReply().clear();
			this.board.remove(articleNum);

		}
	}

	/** 모든 게시글 출력 */
	@Override
	public void display() {
		if (this.board.size() == 0) {
			System.out.println("아직 등록된 게시글이 없습니다.");
			return;
		}
		for (int i = 0; i < this.board.size(); i++) {
			System.out.println(
					i + ". " + this.board.get(i).getTitle() + " (" + this.board.get(i).getReply().size() + ")");
		}

	}

	/** 원하는 게시글 열람 */
	@Override
	public void displayWithNum(int articleNum) {

		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		Article atc = this.board.get(articleNum);
		if (this.board.get(articleNum) != null) {
			atc.readArticle();
			atc.printArticle();
		}

	}

	/** 원하는 게시글 수정 */
	@Override
	public void modifyWithNum(int articleNum) {
		String modtitle, detail;
		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		Article atc = this.board.get(articleNum);
		if (atc != null) {
			System.out.print("수정할 게시글 제목을 입력해주세요 >> ");
			modtitle = sc.nextLine();
			modtitle = modtitle.trim();
			if (modtitle.isBlank() || modtitle.length() > 30) {
				ArticleException ae = new ArticleException("제목의 형식이 바르지 않습니다. 최소 1글자 최대30글자까지 작성해주십시오.");
				throw ae;
			}
			System.out.print("수정할 게시글 내용을 입력해주세요 >> ");
			detail = sc.nextLine();
			atc.modify(modtitle, detail);

		}
	}

	/** 게시글 개수 출력 */
	@Override
	public void articleCount() {
		int cnt = this.board.size();
		if (cnt == 0) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
		System.out.println(cnt + "개의 게시글이 등록되었습니다.");

	}

	/** 게시글에 댓글 추가 */
	@Override
	public void replying(int articleNum) {

		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		Article atc = this.board.get(articleNum);
		if (atc.getReply().size() >= 10) {
			System.out.println("댓글을 더 이상 등록할 수 없습니다.");
			return;
		}
		System.out.println("댓글 내용을 입력해주세요 >> ");
		String repl = sc.nextLine();

		System.out.println("댓글 작성자 이름을 입력해주세요 >> ");
		String replwriter = sc.nextLine();
		replwriter = replwriter.trim();
		if (replwriter.isBlank()) {
			ArticleWriterException awe = new ArticleWriterException("이름을 입력하지 않았습니다.");
			throw awe;
		}

		System.out.println("댓글 작성 날짜를 입력해주세요 >> ");
		System.out.print("YYYY-MM-DD >>");
		String repldate = sc.nextLine();
		repldate = validate(repldate);
		atc.addReply(new Reply(repl, replwriter, repldate));

	}

	/** 원하는 게시글의 댓글을 삭제 */
	@Override
	public void deleteReply(int articleNum, int replyNum) {
		if (this.board.size() == 0) {
			System.out.println("게시글이 존재하지 않습니다.");
			return;
		}
		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		Article atc = this.board.get(articleNum);

		if (replyNum < 0 || atc.getReply().size() <= replyNum) {
			System.out.println("잘못된 댓글 번호입니다.");
			return;
		}
		List<Reply> rp = atc.getReply();

		rp.remove(replyNum);

	}

	/** 댓글 추천 */
	@Override
	public void recommendReply(int articleNum, int replNum) {
		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		Article atc = this.board.get(articleNum);
		if (replNum < 0 || atc.getReply().size() <= replNum) {
			System.out.println("잘못된 댓글 번호입니다.");
			return;
		}
		atc.getReply().get(replNum).replyRecommend();
	}

	/** 게시글 검색 */
	@Override
	public void searchTitle(String title) {
		if (this.board.size() == 0) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
		int cnt = 0;
		for (int i = 0; i < this.board.size(); i++) {
			if (this.board.get(i) != null) {
				String articletitle = this.board.get(i).getTitle();
				if (articletitle.contains(title)) {
					System.out.println(i + ". " + articletitle);
					cnt++;
				}
			}
		}
		if (cnt == 0) {
			System.out.println("검색된 게시글이 없습니다.");
		}
	}

	/** 게시글 전체 삭제 */
	@Override
	public void clearArticle() {
		if (this.board.size() == 0) {
			System.out.println("제거할 게시글이 없습니다.");
			return;
		}
		for (int i = 0; i < this.board.size(); i++) {
			this.board.get(i).getReply().clear();
		}
		System.out.println(this.board.size() + "개의 게시글을 삭제했습니다.");
		this.board.clear();
	}

	/** 댓글 전체 삭제 */
	@Override
	public void clearReply(int articleNum) {
		if (articleNum < 0 || this.board.size() <= articleNum) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		List<Reply> reply = this.board.get(articleNum).getReply();
		System.out.println(reply.size() + "개의 댓글이 삭제되었습니다.");
		reply.clear();
	}
}
