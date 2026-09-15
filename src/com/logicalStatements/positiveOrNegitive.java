package com.logicalStatements;

import java.util.Scanner;

public class positiveOrNegitive {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close();
		if(num >=0) {
			System.out.println("Positive Number");
			System.out.println("Greater Than or equal to 0");
		}
		else {
			System.out.println("Negitive Number");
			System.out.println("Less than 0");
		}
		System.out.println("Main Method Ended!!");

	}

}
