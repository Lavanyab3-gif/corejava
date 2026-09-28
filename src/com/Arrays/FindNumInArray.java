package com.Arrays;

public class FindNumInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int n = 40;
		boolean found = false;
		for (int i = 0; i <= n; i++) {
			if (arr[i] == n) {
				found = true;
				System.out.println("index is:"+i);
				break;
			}
		}
		if (found )
			System.out.println("found");
		else {
			System.out.println("Not Found");
		}

	}

}
