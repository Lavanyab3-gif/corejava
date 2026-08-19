package com.Arrays;

import java.util.Scanner;

public class Missingvalues {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();

		int sum = n * (n + 1) / 2;

		System.out.println("Enter " + n + " numbers:");

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sum = sum - num;
		}

		System.out.println("Missing number: " + sum);
	}
}