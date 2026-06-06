package com.vickey;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		// arraysOrder();
		// repeatedVals();
		// findRepeatedVal();
		// arrysOrderAsc();
		// findDupliactesDiff();
		findDupliactesDiffMethod2();

	}

	static void arrysOrderAsc() {
		int arr[] = { 50, 10, 20, 10, 20, 30, 30, 10, 30, 40, 50, 50 };
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
		 * j++) { if (arr[i] > arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] =
		 * temp;
		 * 
		 * } } }
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	static void arraysOrder() {
		int arr[] = { 10, 20, 10, 20, 30, 30, 10, 30, 40, 50 };
		Boolean found = false;
		int count = 0, m = 0;
		int tempArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				} else {
					found = false;
				}
			} // inner for

			// array without duplicates
			if (!found) {
				for (int k = i + 1; k < tempArr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
						// System.out.println( " " + arr[i]);
					}
				}

				if (count >= 1) {
					System.out.println(count + " " + arr[i]);
					tempArr[m++] = arr[i];
				}
			}

		} // outer for
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] != 0) {
				System.out.println(tempArr[i]);
			}
		}
		System.out.println(Arrays.toString(tempArr));
		// System.out.println(Arrays.toString(arr));

	}// arraysOrder

	static void repeatedVals() {
		int arr[] = { 50, 10, 20, 10, 20, 30, 30, 10, 30, 40, 50 };
		Boolean found = false;
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				} else {
					found = false;
				}
			} // inner for
			if (!found) {
				System.out.print(" " + arr[i]);
				// System.out.println(Arrays.toString(arr));
			}
		}
	}

	static void findRepeatedVal() {
		int arr[] = { 10, 20, 10, 20, 30, 10, 10, 5, 5, 4, 0, 4, 30 };
		boolean found;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			found = false;
			count = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}
				System.out.println(count + "  ===  " + arr[i]);
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void findDupliactesDiff() {
		int arr[] = { 10, 20, 10, 20, 30, 10, 10, 5, 5, 4, 0, 4, 30 };

		for (int i = 0; i < arr.length; i++) {
			// int count = 1;
			boolean hasDuplicateAhead = false;

			// Look forward from the next element to the end of the array
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					// count++;
					hasDuplicateAhead = true; // Found a duplicate ahead!
					break;
				}

			}

			// System.out.println(arr[i]+" "+count);
			// Only print the total count when we reach the LAST occurrence of this number
			if (!hasDuplicateAhead) {
				// We need a quick backward check just to get the correct total count
				// since we missed the earlier duplicates.
				int totalCount = 1;
				for (int m = 0; m < arr.length; m++) {
					if (m != i && arr[i] == arr[m]) {
						totalCount++;
					}
				}
				System.out.println(totalCount + "  ===  " + arr[i]);

			}

		} // outer for

		System.out.println(Arrays.toString(arr));
	}// findDupliactesDiff()

	static void findDupliactesDiffMethod() {
		int arr[] = { 10, 20, 10, 20, 30, 10, 10, 5, 5, 4, 0, 4, 30 };
		int visited = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == visited) {
				continue;
			}
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr[j] = visited;
				}
			}
			System.out.println(count + " time repeated value : " + arr[i]);
		}

	}

	static void findDupliactesDiffMethod2() {
		int arr[] = { 10, 20, 10, 20, 30, 10, 10, 5, 5, 4, 0, 4, 30 };
		boolean[] flag = new boolean[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				continue;
			}
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					flag[j] = true;
				}
			}
			System.out.println(count + " time repeated value : " + arr[i]);
		}

	}
}
