package com.logicalStatementsforloops;

import java.util.Scanner;

public class LargestPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int start = sc.nextInt();
		System.out.println("Enter Ending number:");
		int end = sc.nextInt();
		int largest = 0;

		for (int n = start; n <= end; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				largest = n;
			}

		}
		System.out.println(largest);

	}
}
