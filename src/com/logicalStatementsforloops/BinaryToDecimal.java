package com.logicalStatementsforloops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		binaryToDecimal(n);

	}
	static void binaryToDecimal(int n) {
		int sum =0;
		int count =0;int rem =0;
		while(n>0) {
			rem = n % 10;
			sum = sum +(int)(rem* Math.pow(2,count));
			n = n / 10;
			count++;
		}
		System.out.println("Decimal Number is:"+sum);
	}

}
