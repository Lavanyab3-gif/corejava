package com.logicalStatementsforloops;

import java.util.Scanner;

public class PrimeBetweenMandN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value:");
		int m = sc.nextInt();
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i > 1 && i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}

		}

	}

}
