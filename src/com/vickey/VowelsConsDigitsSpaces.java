package com.vickey;

import java.io.Console;

public class VowelsConsDigitsSpaces {

	public static void main(String[] args) {
		vowelsConsDigitsSpcaesStr();
	}

	static void vowelsConsDigitsSpcaesStr() {
		String str = "sydu lu9";
		str.toLowerCase();
		int vowels_cnt = 0, digits_cnt = 0, spaces_cnt = 0, cons_cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels_cnt++;
			} else if (ch >= '0' && ch <= '9') {
				digits_cnt++;
			} else if (ch == ' ') {
				spaces_cnt++;
			} else  if (ch >= 'a' && ch <= 'z'){
				cons_cnt++;
			}
		}
		System.out.println(vowels_cnt + "" + digits_cnt + "" + spaces_cnt + "" + cons_cnt);
	}

}
