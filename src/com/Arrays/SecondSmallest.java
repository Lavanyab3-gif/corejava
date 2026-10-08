package com.Arrays;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		int secondSmallest =Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("The Second Smallest Number is:" + secondSmallest);

	}

}
