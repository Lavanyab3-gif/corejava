package com.logicalStatementsforloops;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isperfect(n);
		if (status) {
			System.out.println("The number is Perfect number");
		} else
			System.out.println("Not a perfect number");
	}

	static boolean  isperfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			status = true;
		}
		return status;

	}

}
