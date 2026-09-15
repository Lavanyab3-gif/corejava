package com.logicalStatements;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Attendence Percentage:");
		int attendence = sc.nextInt();
		if(attendence >= 75) {
			System.out.println("You are Eligible for the Exam");
		}
		else {
			System.out.println("Not Eligible");
		}
		

	}

}
