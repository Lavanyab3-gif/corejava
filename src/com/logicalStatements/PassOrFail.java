package com.logicalStatements;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = sc.nextInt();
		sc.close();
		if(marks >=40) {
			System.out.println("Congratulations!!");
			System.out.println("You are Passed");
		}
		else
			System.out.println("You are failed!!");
		    System.out.println("All the best for next exam");
		    
		    System.out.println("Main Method ended!!");

	}


}
