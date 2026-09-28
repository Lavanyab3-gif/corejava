package com.Arrays;

public class NextIndex {

	public static void main(String[] args) {
		int[] arr = { 20, 40, 60, 80, 100 };
		int found = 80;
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == found) {
				System.out.println("The index is :" + i);
				break;
			}
		}
	}
}
