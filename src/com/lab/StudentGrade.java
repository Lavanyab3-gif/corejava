package com.lab;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Invalid Marks");
		} else if(marks >=90) {
			System.out.println("Grade A");
		} else if(marks>=75) {
			System.out.println("Grade B");
		} else if(marks >= 60) {
			System.out.println("Grade C");
		} else if(marks >= 40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}


	}

}
