package com.logicalStatementsforloops;

import java.util.Scanner;

public class prime {
	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
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
		System.out.println("main method Started");
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean result = isprime(n);
		if (result) {
			System.out.println("The given number is Prime");
		} else {
			System.out.println(" The given number is Not Prime");
		}

	}

}
