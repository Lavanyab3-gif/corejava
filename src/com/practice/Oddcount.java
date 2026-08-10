package com.practice;

import java.util.Scanner;

public class Oddcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter m");
		System.out.println();
		int m = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		int count = 0;
		for (int i = m; i <= n; i++) {
			if (i % 2 != 0) {
				count++;
			}

		}
		System.out.println(count);
	}
}
