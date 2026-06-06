package com.vickey;

public class LongWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLongestWord2();
	}

	static void findLongestWord1() {
		String str = "I love automation testing famework";
		String words[] = str.split(" ");
		String longest = "";
		int i = 0;
		for (String word : words) {
			if (word.length() > longest.length()) {
				longest = word;
			}
			//System.out.println(longest);
		}
		System.out.println(longest);
	}
	static void findLongestWord2() {
		String str = "I love automation testing famework";
		String current = "";
		String longest = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				current += str.charAt(i);
			}else {
				//current = current+str.charAt(i);
				if(current.length() > longest.length()) {
					longest = current;
				}
				current = "";
			}
			
		}
		
		System.out.println(longest);
	}

}
