package com.logicalStatements;

import java.util.Scanner;

public class currentBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units:");
		int units = sc.nextInt();
		if(units < 0) {
			System.out.println("Invalid");
		} else if(units <= 100) {
			System.out.println("Electricity bill :"+(units * 2));
		} else if(units <= 200) {
			System.out.println("Electricity bill:"+(units * 3));
		} else if(units <= 300) {
			System.out.println("Electricity bill :"+(units * 4));
		} else {
			System.out.println("Electricity bill:"+(units * 7));
		}

	}

}
