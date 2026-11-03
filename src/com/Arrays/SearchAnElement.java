package com.Arrays;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean found = false;

		System.out.println("Enter the target value:");
		int target = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at index:" + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}

	}

}
