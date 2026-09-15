package com.logicalStatements;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		sc.close();

		if (age >= 18) {
			System.out.println("Congratulations ");
			System.out.println("You are Eligible for Vote ");
		} else {
			System.out.println("You are not Eligible for Vote");

		}
		System.out.println("Main Method Ended!!");

	}

}
