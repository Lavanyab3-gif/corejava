package com.lab;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("The Array Elements are:");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("Sum of the Array Elements are:" + sum);

	}

}
