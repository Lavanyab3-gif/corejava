package com.logicalStatementsforloops;

import java.util.Scanner;

public class ArmstrongNumberWithMethod {
	static boolean isArmstrong(int n) {
		int rem = 0;
		int sum = 0;
		int count = 0;
		int temp = n;
		int n1 = n;
		while (n1 > 0) {
			n1 = n1 / 10;
			count++;
		}
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(rem, count));

		}
		if (sum == temp) {

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println("yes!! This is ArmStrong Number..");
		} else {
			System.out.println("No!! this is not ArmStrong Number..");
		}
	}

}
