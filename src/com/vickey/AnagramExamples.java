package com.vickey;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramExamples {
	public static void main(String[] args) {
		checkAnagram();
	}

	static void checkAnagram1() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		int count = 0;
		for (String word : words) {
			char[] charArr = word.toCharArray();
			Arrays.sort(charArr);
			String rword = String.valueOf(charArr);
			String lword = rword;
			
			if (lword.equalsIgnoreCase(rword)) {
				count++;
				//lword="";
			}
			
			System.out.println(lword+" "+count);

		}

	}

	static void checkAnagram() {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String word : words) {
			char[] charArr = word.toCharArray();
			Arrays.sort(charArr);
			String eachWord = String.valueOf(charArr);

			map.put(eachWord, map.getOrDefault(eachWord, 0) + 1);

		}
		for (Entry<String, Integer> wordss : map.entrySet()) {
			System.out.println(wordss.getKey() + " " + wordss.getValue());
		}

		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

		for (Integer value : map.values()) {
			System.out.println(value);
		}

		System.out.println(map);
	}

}
