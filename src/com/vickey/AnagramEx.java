package com.vickey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// checkAnagrams();
		 checkanagramsgrp();
		//checkAnagramsFromArr();
		// checkAnagramsMap();
	}

	static void checkAnagramsMap() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String, List<String>> map = new HashMap<>();

		for (String word : words) {
			char[] arr = word.toCharArray();
			Arrays.sort(arr);

			String key = new String(arr);
			map.putIfAbsent(key, new ArrayList<String>());
			boolean added = map.get(key).add(word);
			// List<String> listStr = map.computeIfAbsent(key, k -> new ArrayList<>());
			// listStr.add(word);

			// map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
			if (added) {
				System.out.println(map.values());
			}
		}

		System.out.println(map.values());
	}

	static void checkAnagramsFromArr() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		int count;
		boolean found;
		for (int i = 0; i < words.length; i++) {
			found = false;
			char[] charArri = words[i].toCharArray();
			Arrays.sort(charArri);
			count = 1;
			for (int j = 0; j < i; j++) {
				char[] charArrj = words[j].toCharArray();
				Arrays.sort(charArrj);
				if (Arrays.equals(charArri, charArrj)) {
					found = true;
					break;
				}

			}
			if (!found) {
				for (int k = i + 1; k < words.length; k++) {
					char[] charArrk = words[k].toCharArray();
					Arrays.sort(charArrk);
					if (Arrays.equals(charArri, charArrk)) {
						count++;
					}

				}
				if (count >= 1) {
					System.out.println(count + " " + String.valueOf(charArri));
				}
				// System.out.println(count + " " + String.valueOf(charArri));
			} // if
				// Arrays.sort(words);

		} // for(i)

	}// method

	static void checkAnagram() {
		String str1 = "silent";
		String str2 = "listen";

		if (str1.length() != str2.length()) {
			System.err.println(" length not matched So Not anagrams");
			return;
		}
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println(str2 + " " + str1);

		System.out.println(Arrays.equals(charArr1, charArr2) ? "anagrams" : "not anagrams");
	}

	static void checkAnagrams() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// [[eat, tea, ate], [tan, nat], [bat]]

		boolean found = false;
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			char[] wordArri = words[i].toCharArray();
			Arrays.sort(wordArri);
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				char[] wordArrj = words[j].toCharArray();
				Arrays.sort(wordArrj);
				found = Arrays.equals(wordArri, wordArrj);

			} // inner for

			if (!found) {
				for (int j = i + 1; j < words.length; j++) {
					Arrays.sort(words[j].toCharArray());
					if (wordArri.equals(words[i].toCharArray())) {
						count++;
					}
				}

			}
			if (count > 1)
				System.out.println(count + "" + String.valueOf(wordArri));

		} // outer for

	}

	static void checkanagramsgrp() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// [[eat, tea, ate], [tan, nat], [bat]]
		Map<String, List<String>> word_str = new HashMap<String, List<String>>();
		for (String word : words) {
			char[] wordchar = word.toCharArray();
			Arrays.sort(wordchar);
			String str_key = new String(wordchar);// converting char to String
			word_str.putIfAbsent(str_key, new ArrayList<String>());
			word_str.get(str_key).add(word);
		}
		word_str.forEach((key, value) -> {
			System.out.println(value);
		});

		for (List<String> string : word_str.values()) {
			System.out.println(string);
		}
		System.out.println(word_str.values());
	}

}
