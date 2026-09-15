package com.logicalStatements;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary:");
		double sal = sc.nextDouble();
		if(sal <= 20000) {
			System.out.println("Grade D");
		} else if(sal >= 20000 && sal <= 39999) {
			System.out.println("Grade C");
		} else if(sal <= 40000 && sal >= 69999) {
			System.out.println("Grade B");
		} else if(sal >= 70000) {
			System.out.println("Grade A");
		}

	}

}
