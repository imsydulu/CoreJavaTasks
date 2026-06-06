package com.vickey;

public class ReverseString {

	public static void main(String[] args) {
		reverseString();
		checkPalindrome("mother");
	}

	static void reverseString() {
		String str = "Sydulu";
		String rev_str = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev_str = rev_str + str.charAt(i);
		}

		System.out.println(str + "\t" + rev_str);
	}

	static void checkPalindrome(String given_str) {

		if (given_str.equalsIgnoreCase(revString(given_str))) {
			System.out.println(given_str + " is a palindrome-----");
		} else {
			System.err.println(given_str + " is not a palindrome-----");
		}
	}

	static String revString(String str) {
		String rev_str = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev_str = rev_str + str.charAt(i);
		}
		return rev_str;
	}
}
