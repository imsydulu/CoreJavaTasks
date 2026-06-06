package com.vickey;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// occuranceChar();
		withoutduplicates("ssssydulu");
	}

	static void withoutduplicates(String str) {
		int count = 0;
		char[] chars = str.toCharArray();
		boolean found = false;
		String final_str = "";
		System.out.println(str);
		for (int i = 0; i < chars.length; i++) {
			count = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					found = true;
					break;
				}
			} // j for
			if (found) {
				for (int j = i+1; j < chars.length; j++) {
					if (chars[i] == chars[j]) {
						count++;
					}
				}
			} // if(!found)
			if (count == 0) {
				final_str = final_str + chars[i];
			}else {
				System.out.println(count+" "+chars[i]);
			}
		}
		System.out.println(final_str);
	}

	static void occuranceChar() {
		String str = "dsyduluuuud";
		int count = 0;
		boolean found = false;
		for (int i = 0; i < str.length() - 1; i++) {
			// ch = str.charAt(i);
			count = 1;
			if (str.charAt(i) == str.charAt(i + 1)) {
				found = true;
				break;
			} // inner for
			if (!found) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				} // for
			} // if
			if (count >= 1) {
				System.out.println(count + " " + str.charAt(i));
			}
		} // for
	}

}
