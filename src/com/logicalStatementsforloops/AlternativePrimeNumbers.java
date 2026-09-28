package com.logicalStatementsforloops;

import java.util.Scanner;

public class AlternativePrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int primeCount = 0;
		for (int num = 2; num <= n; num++) {
			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				if (primeCount % 2 == 0) {    
					System.out.print(num + " ");
				}
				primeCount++;
			}

		}
	}
}
