package com.ktdsuniversity.edu.oop.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		//ArticleSystem is a ArticleService
		ArticleService articleservice = new ArticleSystem();
		articleservice.write();
		articleservice.delete();
		articleservice.view();
		
		//ArticleSystem is a ReplyService
		ReplyService replyservice = new ArticleSystem();
		replyservice.addReply();
		replyservice.deleteReply();
		replyservice.recommendReply();
		
		//MemberService, VipMemberService의 인스턴스 생성
		//VipMemberService, is a MemberService
		//System1 is a MemberService
		MemberService system1 = new Member();
		system1.login();
		system1.join();
		system1.deleteMe();
		system1.logout();
		//System2 is a VipMemberService
		VipMemberService system2 = new VipMember();
		system2.login();
		system2.join();
		system2.deleteMe();
		system2.logout();
		system2.addPoint(100);
		//System2 is a MemberService
		MemberService system3 = new VipMember();
		system3.login();
		system3.join();
		system3.deleteMe();
		system3.logout();
//		system3.addPoint(100); //껍데기인 MemberService에는 addPoint 메소드가 없기 때문에 이대로는 사용할 수 없다.
		if(system3 instanceof VipMember vipmember) {
			vipmember.addPoint(100);
		}
		
		
		//SomeInterface의 인스턴스를 생성해보기
		//Interface는 인스턴스로 생성할 수 없다
		//Java의 인스턴스는 모든 메소드가 구현이 되어있어야 한다.
//		SomeInterface inf = new SomeClass();
		SomeInterface inf = new SomeClass2();
		inf.doSomething1();
		inf.doSomething2();
		inf.doSomething3();
		int val = inf.getSomething();
		String str = inf.getString();
		System.out.println(val);
		System.out.println(str);
	}

}
