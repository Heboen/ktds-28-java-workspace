package com.ktdsuniversity.edu.oop.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		String name = null;
		if(name == null) {
			System.out.println("이름을 입력해 주세요.");
		}
		else {
			System.out.println(name);
		}
		//name이라는 인스턴스의 값이 null이라면 "이름을 입력해 주세요"를 출력한다.
		//name이라는 인스턴스의 값이 null이 아니라면 이름을 출력한다.
		
		String job = "    ";
		//name이라는 인스턴스의 값이 "" 이라면 "이름을 입력해주세요"를 출력한다.
		//아니라면 값 출력
		if(job == null || job.isBlank()) {
			System.out.println("직업을 입력해 주세요");
		}
		else {
			System.out.println(job);
		}
		//Java11이하 일때
		if( job==null || job.trim().length() == 0) { //trim을 하면 공백으로 이루어진 문자열은 공백이 다 사라짐
			System.out.println("직업을 입력해 주세요");
		}
		else {
			System.out.println(job);
		}
		
		String address = "   ";
		//address라는 인스턴스의 값이 ""이라면 "주소를 입력해주세요"를 출력한다.
		//아니라면 값을 출력한다.
		if(StringUtils.isEmpty(address)) {
			System.out.println("주소를 입력해주세요");
		}
		else {
			System.out.println(address);
		}
		
		String message = StringUtils.emptyToDefault(job, "주소를 입력해주세요");
		System.out.println(message);
		
	}
}
