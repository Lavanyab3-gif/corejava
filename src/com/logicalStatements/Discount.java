package com.logicalStatements;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		int bill = sc.nextInt();
		if(bill >= 10000) {
			System.out.println("You got discount on ur shopping");
		}else {
			System.out.println("No discount");
		}

	}

}
