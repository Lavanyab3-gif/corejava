package com.logicalStatementsforloops;

import java.util.Scanner;

public class SumOfPrimePlaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0;

		for (int num = 0; num <= n; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {

				sum = sum + num;
			}
		}
		System.out.println("The sum of Prime places are :" + sum);

	}

}
