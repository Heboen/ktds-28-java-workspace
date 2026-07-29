package com.ktdsuniversity.edu.oop.exception;

public class StringUtils {

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static String emptyToDefault(String str, String defaultString) {
		if( str != null && !str.isBlank()) {
			return str;
		}
		else {
			return defaultString;
		}
	}
	
}

