package com.logicalStatementsforloops;

import java.util.Scanner;

public class FactorWithMethod {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n values:");
		int n = sc.nextInt();
		factors(n);
		

	}
	static void factors(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n %i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}  

}
