package com.ktdsuniversity.edu.oop.board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		int num = 0;
		int idx = 0;
		int ridx = 0;
		String str;
		Scanner sc = new Scanner(System.in);
		while (true) {
			printmenu();
			try {
				num = Integer.parseInt(sc.next());
				if (num == 0) {
					System.out.println("동작을 종료합니다.");
					sc.close();
					break;
				} else if (num == 1) {
					board.write();
				} else if (num == 2) {
					board.display();
				} else if (num == 3) {
					System.out.println("출력하실 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					board.displayWithNum(idx);
				} else if (num == 4) {
					System.out.println("수정하실 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					board.modifyWithNum(idx);
				} else if (num == 5) {
					System.out.println("삭제하실 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					board.delete(idx);
				} else if (num == 6) {
					board.articleCount();
				} else if (num == 7) {
					System.out.println("댓글을 작성하실 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					board.replying(idx);
				} else if (num == 8) {
					System.out.println("댓글을 삭제할 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					System.out.println("삭제하실 댓글의 번호를 입력해주세요");
					ridx = Integer.parseInt(sc.next());
					board.deleteReply(idx, ridx);
				} else if (num == 9) {
					System.out.println("댓글을 추천할 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					System.out.println("추천할 댓글의 번호를 입력해주세요.");
					ridx = Integer.parseInt(sc.next());
					board.recommendReply(idx, ridx);
				} else if (num == 10) {
					System.out.println("검색어를 입력해주세요.");
					str = sc.next();
					board.searchTitle(str);
				} else if (num == 11) {
					board.clearAticle();
				} else if (num == 12) {
					System.out.println("댓글을 삭제할 게시글의 번호를 입력해주세요");
					idx = Integer.parseInt(sc.next());
					board.clearReply(idx);
				} else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}

		}

	}

	public static void printmenu() {
		System.out.println("====게시판====");
		System.out.println("이용하실 기능의 번호를 입력해주세요");
		System.out.println("0. 종료  1.게시글 작성  2.게시글 목록 출력  3.게시글 정보 출력");
		System.out.println("4.게시글 수정  5.게시글 삭제  6.게시글 개수 출력  7.댓글 작성");
		System.out.println("8.게시글 댓글 삭제  9.댓글 추천  10.게시글 검색  11.목록 전체 삭제");
		System.out.println("12.게시글 댓글 전체 삭제");
	}
}
