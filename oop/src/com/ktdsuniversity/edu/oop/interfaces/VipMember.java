package com.ktdsuniversity.edu.oop.interfaces;

public class VipMember implements VipMemberService{

	@Override
	public void join() {
		System.out.println("vip회원가입");
		
	}

	@Override
	public void login() {
		System.out.println("vip로그인");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("vip회원탈퇴");
		
	}

	@Override
	public void logout() {
		System.out.println("vip로그아웃");
		
	}

	@Override
	public void addPoint(int point) {
		System.out.printf("포인트를 %d 추가합니다", point);
		
	}

	
}
