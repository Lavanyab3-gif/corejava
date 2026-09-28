package com.logicalStatementsforloops;

import java.util.Scanner;

public class EvenPositionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int count = 0;
		while (n > 0) {
			r = n % 10;
			if (n % 2 == 0  ) {
				sum = sum + r;
			}
			n = n / 10;
			count++;
		}
		System.out.println("The sum of even positions is:" + sum);
	}
}
