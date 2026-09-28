package com.logicalStatementsforloops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int rem = 0;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		while(n>0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("The sum of the digits is:"+sum);

	}

}
