package com.vickey;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
				splitStringDelimeter();
	}

	static void splitStringDelimeter() {
		String str1 = "apple,banana,orange";
		String str = "apple banana orange";
		/*
		 * String[] strs=str.split(","); //System.out.println(Arrays.toString(strs));
		 * for (String string : strs) { System.out.println(string); }
		 */
		
		String del = " ";
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals(del)) {
				System.out.println(str.substring(start, i));
				start = i+1;
			}
		}
		System.out.println(str.substring(start));
	}
	
	

}
