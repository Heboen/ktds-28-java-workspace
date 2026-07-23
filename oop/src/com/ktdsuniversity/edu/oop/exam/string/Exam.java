package com.ktdsuniversity.edu.oop.exam.string;

public class Exam {
	public static void main(String[] args) {
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울");
		System.out.println("contains "+isSeoul);
		boolean isSeoule = address.contains("176");
		System.out.println("contains "+isSeoule);
		
		String name = "ktdsuniversity";
		boolean isEqual = name.equals("ktdsuniversity");
		System.out.println("equals " + isEqual);
		
		boolean isEqualig = name.equalsIgnoreCase("ktdsUniversity");
		System.out.println("equals " + isEqualig);
		
		String alphabets = "abcdefg";
		int letterCIndex = alphabets.indexOf('c');
		System.out.println("indexof " + letterCIndex);
		
		int letterCIndexU = alphabets.indexOf('C');
		System.out.println("indexof " + letterCIndexU);
		
		int letterDEFIndex = alphabets.indexOf("def");
		System.out.println("indexof " + letterDEFIndex);

		String str = "    ";
		boolean isBlank = str.isBlank();
		System.out.println("isblank " + isBlank);
		
		boolean isEmpty = str.isEmpty();
		System.out.println("isempty " + isEmpty);
		
		String message = "안녕하세요";
		String person = "홍길동님";
		String helloMessage = String.join(", ", message, person);
		System.out.println("join " +helloMessage);
		
		String mss = "abcdefgaijkb";
		int length = message.length();
		System.out.println("length " + length);
		
		String phone = "01012341234";
		boolean isNumber = phone.matches("^[0-9]+$");
		System.out.println("isnumber " + isNumber);
		
		String st = "안녕하세요, 홍길동님, 안녕히 가세요, 홍길동님";
		st = st.replace("홍길동", "ktds");
		System.out.println("replace " + st);
		
		String phone2 = "010-1234-1234";
		phone2 = phone2.replaceAll("[^0-9]", "");
		System.out.println(phone2);
		
		String phone3 = "010-1234-1234";
		String[] phoneArea = phone3.split("-");
		System.out.println(phoneArea[0]);
		System.out.println(phoneArea[1]);
		System.out.println(phoneArea[2]);
		
		String phone4 = "+82-010-1234-1234";
		boolean isKoreaNum = phone4.startsWith("+82");
		System.out.println(isKoreaNum);
		
		String datetime = "2023-05-02 14:56:13";
		String year = datetime.substring(0,4);
		System.out.println(year);
		
		String hour = datetime.substring(11,13);
		System.out.println(hour);
		
		String time = datetime.substring(11);
		System.out.println(time);
		
		String datetime2 = "  2023-05-02 14:56:13  ";
		System.out.println("len "+ datetime2.length());
		System.out.println(datetime2);
		datetime2 = datetime2.trim();
		System.out.println("len " + datetime2.length());
		System.out.println(datetime2);
		
		String iStr = String.valueOf(1);
		System.out.println(iStr);
		
		int maxnum = Integer.MAX_VALUE;
		System.out.println(maxnum);
		
		String numstr = "%,d".formatted(maxnum);
		System.out.println(numstr);
		
		String messageFormat = "%s에서 교육하는 %s과정, %d시간 %d일 과정, %f (%.2f) 진행했습니다.";
		String formatmessage = String.format(messageFormat, "ktds University", "Java Programming", 800, 100, 8 / 100d,
				8 / 100d);
		System.out.println(formatmessage);
	}

}
