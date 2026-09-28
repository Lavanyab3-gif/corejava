package com.logicalStatementsforloops;

import java.util.Scanner;

public class PrimePlacesInPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int pos = 0;
		for (int i = 2; i <= num; i++) {
			if (prime(i)) {
				pos++;
				if (prime(pos)) {
					System.out.println(i);
				}
			}

		}

	}

	static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;

	}

}
