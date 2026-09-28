package com.logicalStatementsforloops;

import java.util.Scanner;

public class MagicNumberWithIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum =0;
		while(n>0) {
			int r = n % 10;
			sum = sum +r;
			n = n / 10;
			if( n == 0 && sum > 9) {
				n = sum;
				sum =0;
			}
		}
		if(sum == 1) {
			System.out.println("Magic Number");
		}
		else {
			System.out.println("Not a magic Number");
		}

	}

}
