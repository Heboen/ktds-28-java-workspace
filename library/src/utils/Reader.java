package utils;

import java.util.Scanner;

public final class Reader {

	public static final Scanner reader;
	
	static {
		reader = new Scanner(System.in);
	}
	
	private Reader() {
		
	}
	
	public static String read() {
		return reader.next().trim();
	}
	
	public static String readString() {
		while (true) {
			String str = read();
			if (str.isBlank()) {
				System.out.println("입력이 바르지 않습니다.");
			}
			return str;
		}

	}

	public static int readInt() {
		while (true) {
			try {
				return Integer.parseInt(read());
			} catch (NumberFormatException nfe) {
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
}
