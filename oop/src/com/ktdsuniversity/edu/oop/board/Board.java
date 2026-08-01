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
	List<Article> board;
	Scanner sc = new Scanner(System.in);
	public Board() {
		this.board = new ArrayList<>();
	}
	
	/**게시글 추천*/
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

	/**게시글 작성하기()*/
	@Override
	public void write() {
		
		String title, name, date, detail;

		System.out.print("제목을 입력해주세요>> ");

		title = sc.nextLine();
		if (title.isBlank()|| title.length() > 30) {
			ArticleException ae = new ArticleException("제목의 형식이 바르지 않습니다. 최소 1글자 최대30글자까지 작성해주십시오.");
			throw ae;
		} else {
			System.out.print("이름을 입력해주세요. >>");
			name = sc.nextLine();
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
		}
		this.board.add(new Article(title, name, date, detail));
	}

	/**원하는 게시글*/
	@Override
	public void delete(int articlenum) {
		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("존재하지 않은 게시글입니다.");
		} else {
			if (this.board.get(articlenum) != null) {
				this.board.remove(articlenum);
			}
		}
	}

	/**모든 게시글 출력*/
	@Override
	public void display() {
		if (this.board.size() == 0) {
			System.out.println("아직 등록된 게시글이 없습니다.");
		} else {
			for (int i = 0; i < this.board.size(); i++) {
				System.out.println(
						i + ". " + this.board.get(i).getTitle() + " (" + this.board.get(i).getReply().size() + ")");
			}
		}
	}

	/**원하는 게시글 열람*/
	@Override
	public void displayWithNum(int articlenum) {

		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("잘못된 게시글 번호입니다.");
		} else {
			Article atc = this.board.get(articlenum);
			if (this.board.get(articlenum) != null) {
				atc.readpost();
				atc.printArticle();
			}
		}
	}

	/**원하는 게시글 수정*/
	@Override
	public void modifyWithNum(int articlenum) {
		String modtitle, detail;
		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("잘못된 게시글 번호입니다.");
		} else {
			Article atc = this.board.get(articlenum);
			if (atc != null) {
				System.out.print("수정할 게시글 제목을 입력해주세요 >> ");
				modtitle = sc.nextLine();
				System.out.print("수정할 게시글 내용을 입력해주세요 >> ");
				detail = sc.nextLine();
				atc.modify(modtitle, detail);
			}
		}
	}

	/**게시글 개수 출력*/
	@Override
	public void articleCount() {
		int cnt = this.board.size();
		if (cnt == 0) {
			System.out.println("등록된 게시글이 없습니다.");
		} else {
			System.out.println(cnt + "개의 게시글이 등록되었습니다.");
		}
	}
	
	/**게시글에 댓글 추가*/
	@Override
	public void replying(int articlenum) {
		

		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("잘못된 게시글 번호입니다.");
		} else {
			Article atc = this.board.get(articlenum);
			if (atc.getReply().size() > 10) {
				System.out.println("댓글을 더 이상 등록할 수 없습니다.");
			} else {
				System.out.println("댓글 내용을 입력해주세요 >> ");
				String repl = sc.nextLine();

				System.out.println("댓글 작성자 이름을 입력해주세요 >> ");
				String replwriter = sc.nextLine();
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
		}
	}

	/**원하는 게시글의 댓글을 삭제*/
	@Override
	public void deleteReply(int articlenum, int replynum) {
		if (this.board.size() == 0) {
			System.out.println("게시글이 존재하지 않습니다.");
		} else {
			if (articlenum < 0 || this.board.size() <= articlenum) {
				System.out.println("잘못된 게시글 번호입니다.");
			} else {
				Article atc = this.board.get(articlenum);
				
				if (replynum < 0 || atc.getReply().size() <= replynum) {
					System.out.println("잘못된 댓글 번호입니다.");
				} else {
					List<Reply> rp = atc.getReply();
					rp.remove(replynum);
				}
			}

		}
		
	}

	/**댓글 추천*/
	@Override
	public void recommendReply(int articlenum, int replnum) {
		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("잘못된 게시글 번호입니다.");
		} else {
			Article atc = this.board.get(articlenum);
			if (replnum < 0 || atc.getReply().size() <= replnum) {
				System.out.println("잘못된 댓글 번호입니다.");
			} else {
				atc.getReply().get(replnum).replyRecommend();
			}
		}
	}

	/**게시글 검색*/
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

	/**게시글 전체 삭제*/
	@Override
	public void clearArticle() {
		if (this.board.size() == 0) {
			System.out.println("제거할 게시글이 없습니다.");
		} else {
			this.board.clear();
		}
	}

	/**댓글 전체 삭제*/
	@Override
	public void clearReply(int articlenum) {
		if (articlenum < 0 || this.board.size() <= articlenum) {
			System.out.println("잘못된 게시글 번호입니다.");
		}
		else {
			this.board.get(articlenum).getReply().clear();
		}
	}

}
