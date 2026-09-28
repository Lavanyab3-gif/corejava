package com.logicalStatementsforloops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rev = 0;
		int rem =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int temp = n;
		while(n>0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if(rev == temp) {
			System.out.println("The given number is pallendrome");
		}else 
			System.out.println("Not a Pallindrome number ");

	}

}
