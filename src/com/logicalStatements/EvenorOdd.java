package com.logicalStatements;

import java.util.Scanner;

public class EvenorOdd {
	

	public static void main(String[] args) {
		System.out.println("Main Method Strated!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close();
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		System.out.println("Main Method Ended!!");
		
	}

}
