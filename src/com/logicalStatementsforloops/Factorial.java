package com.logicalStatementsforloops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int fact = isfact(n);
		System.out.println("The Factorial of a number is:" + fact);
	}
	
	static int isfact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {

			fact = fact * i;
		}

		return fact;
	}
}
