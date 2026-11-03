package com.Arrays;

import java.util.Scanner;

public class Missingvalues {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int sum = (n+1) * (n + 2) / 2;

		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sum = sum - num;
		}

		System.out.println("Missing number: " + sum);
	}
}