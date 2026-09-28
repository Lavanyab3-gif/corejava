package com.logicalStatementsforloops;

import java.util.Scanner;

public class PerfectwithoutMethod {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n % i == 0) {
				sum +=i;
				System.out.println(sum);
			}
		}
		
		if(sum == n) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not Perfect");
		}
		

	}

}
