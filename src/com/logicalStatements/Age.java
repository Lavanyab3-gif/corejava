package com.logicalStatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if(age > 60) {
			System.out.println("Old Age");
		} else if(age > 45) {
			System.out.println("Middle Age");
		} else if(age > 20 ) {
			System.out.println("Young Age");
		} else if(age > 15 ) {
			System.out.println("Teen Age");	
		} else if(age > 6) {
			System.out.println("Children");
		} else if(age<=5) {
			System.out.println("Kids");
		}

	}

}
