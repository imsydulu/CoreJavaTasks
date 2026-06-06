package com.vickey;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		convertStrInt();
	}

	static void convertStrInt() {
		String str = "1234";
		int val5 = 0;
		int val1 = Integer.valueOf(str);
		int val2 = Integer.parseInt(str);
		Scanner sc = new Scanner(str);
		int val3 = sc.nextInt();
		sc.close();
		int val4 = (int) Double.parseDouble(str);
		// custom login manual conversion
		for (int i = 0; i < str.length(); i++) {

			//val5 = val5 * 10 + (str.charAt(i) - '0');
			//int n = Character.getNumericValue(str.charAt(i));
			val5 = val5*10+Character.getNumericValue(str.charAt(i));
			System.out.println(val5);
		}

		//System.out.println(val1 + " " + val2 + " " + val3 + " " + val4 + " " + val5);

	}
}
