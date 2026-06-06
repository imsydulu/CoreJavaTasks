package com.vickey;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {

	public static void main(String[] args) {
		findDuplicatesString();
		duplicatesWithMap();
	}

	static void findDuplicatesString() {
		String str = "syduluuuusydu";
		boolean found = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					found = true;
					break;
				}
			} // inner for
			if (!found) {
				for (int k = i; k < str.length(); k++) {
					if (str.charAt(i) == str.charAt(k)) {
						count++;
					}
				}

			}
			
			if (count == 2) {
				System.out.println(count + " = " + str.charAt(i));
				break;
			}
		} // outer for

	}
	
	static void duplicatesWithMap() {
		String str = "syduluuuuuu";
		char[] charArr = str.toCharArray();
		Map<Character, Integer> mapc = new HashMap<Character, Integer>();
		for (char c : charArr) {
			mapc.put(c, mapc.getOrDefault(c, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : mapc.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
		
		
		
	}
}
