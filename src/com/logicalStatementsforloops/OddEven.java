package com.logicalStatementsforloops;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++) {
			if(i % 2 == 0 && i!=0) {
				System.out.println(i);
			}
		}

	}

}
