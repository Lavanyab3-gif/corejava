package com.logicalStatementsforloops;

import java.util.Scanner;

public class NumberOfPrimes {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to print..?:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	  }

}
