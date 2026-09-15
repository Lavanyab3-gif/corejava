package com.logicalStatements;

import java.util.Scanner;

public class ExamPass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks in theory:");
		int marksintheory = sc.nextInt();
		System.out.println("Enter the marks in practicals:");
		int marksinprac = sc.nextInt();
		if(marksintheory >=35 && marksinprac >=40) {
			System.out.println("You are passes in both the subjects");
		}
		else {
			System.out.println("You are failed");
		}
		

	}

}
