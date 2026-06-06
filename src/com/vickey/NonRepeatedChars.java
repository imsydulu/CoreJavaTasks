package com.vickey;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nonRepeatedChars();
		// nonRepeated();
		NonRepeatedCharss();
	}

	static void nonRepeatedChars() {
		String str = "sydulu";
		char ch;
		for (int i = 0; i < str.length() - 1; i++) {
			ch = str.charAt(i);
			if (str.charAt(i) == str.charAt(i + 1)) {
				System.out.println(" repeated==== " + str.charAt(i));
				break;
			} else {
				System.out.println(" non - repeated==== " + str.charAt(i));
			}
		}
	}

	static void nonRepeated() {
		String str = "sydulu";
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
		char[] charArr = str.toCharArray();
		int count = 0;
		for (char c : charArr) {
			cmap.put(c, cmap.getOrDefault(c, 0) + 1);
			if (cmap.get(c) == 1) {
				count++;
				System.out.println(c);

				if (count == 2)
					break;
			}
		}

	}

	public static void NonRepeatedCharss() {

		String str = "programming";

		int found = 0;

		for (int i = 0; i < str.length(); i++) {
			boolean isRepeated = false;

			for (int j = i + 1; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isRepeated = true;
					break;
				}
			}

			if (!isRepeated) {
				System.out.println(str.charAt(i));
				found++;
				if (found == 2)
					break;
			}
		}
	}
}
