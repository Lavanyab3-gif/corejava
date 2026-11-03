package com.Arrays;

public class FrequencyOfEachElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3 };
		boolean[] found = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (found[i]) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					found[j] = true;
				}
			}

			System.out.println(arr[i] + " occurs " + count + " times");
		}
	}
}
