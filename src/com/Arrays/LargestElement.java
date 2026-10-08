package com.Arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Largest Elemeent is:" + max);

	}

}
