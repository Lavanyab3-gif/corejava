package com.logicalStatementsforloops;

import java.util.Scanner;

public class DecimalToBinary {
	static void decimalToBinary(int n) {
		int r = 0;
		String str = "";
		while (n > 0) {
			r = n % 2;
			n = n / 2;
			str = r + str;
		}

		System.out.println("The Binary Number is :" + str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		decimalToBinary(n);

	}

}
