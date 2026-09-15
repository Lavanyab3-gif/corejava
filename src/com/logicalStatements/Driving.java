package com.logicalStatements;

import java.util.Scanner;

public class Driving {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		sc.close();

		if (age >= 18) {
			System.out.println("Congratulations!!");
			System.out.println("Your are eligible for driving license!!");
		}

		else {
			System.out.println("You are not eligible so, Better luck next time");
		}

	}
	

}
