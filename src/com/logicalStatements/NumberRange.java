package com.logicalStatements;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if(num >=10 && num <= 10) {
			System.out.println("SMALL");
		} else if(num >= 11 && num <= 50) {
			System.out.println("MEDIUM");
		} else if(num >= 51 && num <= 100) {
			System.out.println("LARGE");
		} else if(num > 100) {
			System.out.println("VERY LARGE");
		}

	}

}
