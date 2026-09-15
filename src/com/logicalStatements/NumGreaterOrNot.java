package com.logicalStatements;

import java.util.Scanner;

public class NumGreaterOrNot {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		sc.close();
		if(number >=50){
			System.out.println("Greater than 50");
		}
		else {
			System.out.println("Less than 50");
		}

	}

}
