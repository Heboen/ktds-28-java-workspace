package com.ktdsuniversity.edu.oop.interfaces;

public class Member implements MemberService{

	@Override
	public void join() {
		System.out.println("회원가입");
		
	}

	@Override
	public void login() {
		System.out.println("로그인");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("회원탈퇴");
		
	}

	@Override
	public void logout() {
		System.out.println("로그아웃");
		
	}
	

}
