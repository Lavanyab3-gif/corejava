package com.logicalStatements;

import java.util.Scanner;

public class NumberCategory {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(n == 0) {
			System.out.println("ZERO");
		} else if(n < 0) {
			System.out.println("Negitive");
		}
		else {
			System.out.println("Positive");
		}
		

	}

}
