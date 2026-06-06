package com.vickey;

import java.util.Arrays;

public class ComparaTowStrings {

	public static void main(String[] args) {
		compareTwoStr2();

	}

	static void compareTwoStr1() {
		String str_one = "listen";
		String str_two = "listen";
		Arrays.sort(str_two.toCharArray());
		Arrays.sort(str_one.toCharArray());
		if (str_one == str_two) {
			System.out.println("equal");
		} else {
			System.err.println("not equal");
		}
		// compareto
		if (str_one.compareTo(str_two) == 0) {
			System.out.println("2. Equal===");
		} else {
			System.err.println("2. not equal");
		}

		System.out.println(str_one.compareTo(str_two) == 0 ? "Equal?" : "Not Equal?");
	}

	static void compareTwoStr2() {
		String str_one = "listen";
		String str_two = "listen";
		char[] onechars = str_one.toCharArray();
		char[] twochars = str_two.toCharArray();
		boolean flag = false;
		if (onechars.length != twochars.length) {
			flag = false;
			System.err.println("length is not equal, should not compare!");
			return;
		} else {
			for (int i = 0; i < twochars.length; i++) {
				if (onechars[i] == twochars[i]) {
					flag = true;
					System.out.println(onechars[i]+" = "+twochars[i]);
					
				}else {
					flag = false;
					break;
					
				}

			}
		}//else
		System.out.println(flag ? "given strings are equal":"given strings are not equal");

	}

}
