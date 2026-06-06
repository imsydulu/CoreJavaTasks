package com.vickey;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// withoutsuplicates();
		// findchar();
		findRepeatedChars();
	}

	static void findRepeatedChars() {
		String str = "swiss";
		Map<Character, Integer> strmap = new HashMap<>();
		for (char c : str.toCharArray()) {
			//strmap.put(c, strmap.getOrDefault(c, 0) + 1); // repeated values
			strmap.putIfAbsent(c, strmap.getOrDefault(c, 0) + 1);
		}
		for (Character val : strmap.keySet()) {
			System.out.print(val.charValue());
		}
		for (Integer val : strmap.values()) {
			System.out.print(val + "\n");
		}
		for (Map.Entry<Character, Integer> entry : strmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		strmap.forEach((key, val) -> {
			System.out.println(key + " " + val);
		});
	}

	static void withoutsuplicates() {
		String str = "swiss";
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				boolean found = false;
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						found = true;
						break;
						// break;
					}

				} // close for:J
				if (!found) {
					System.out.println(str.charAt(i));
				} // if(found)

			} // for:i

		} // if()

	}// withoutsuplicates()

	static void findchar() {
		String str = "swiss";
		// int count = 0;
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				boolean found = false;
				// count = 0;
				for (int j = 0; j < i; j++) {
					if (str.charAt(i) == str.charAt(j)) {
						found = true;
						break;
					}
				} // for:j
				if (!found) {
					int count = 1;
					for (int k = i + 1; k < str.length(); k++) {
						if (str.charAt(i) == str.charAt(k)) {
							count++;
						}

					}
					if (count > 1) {
						System.out.println(count + " " + str.charAt(i));
						break;
					}
				} // if
			}
		}
	}

}
