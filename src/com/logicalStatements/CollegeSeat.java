package com.logicalStatements;

import java.util.Scanner;

public class CollegeSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage:");
		int percentage = sc.nextInt();
		if(percentage >=90) {
			System.out.println("TOP UNIVERSITY !!");
		} else if(percentage >=75 && percentage <= 89) {
			System.out.println("UNIVERSITY !!");
		} else if(percentage >= 60 && percentage <= 74) {
			System.out.println("Degree College");
		} else if(percentage >= 40 && percentage <= 59) {
			System.out.println("Diploma");
		} else {
			System.out.println("NOT ELIGIBLE");
		}

	}

}
