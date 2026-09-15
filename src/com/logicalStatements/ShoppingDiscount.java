package com.logicalStatements;

import java.util.Scanner;

public class ShoppingDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill:");
		long bill = sc.nextLong();
		if(bill < 1000) {
			System.out.println("No Discount");
		} else if(bill >= 1000 && bill <= 4999) {
			System.out.println("5% Discount");
		} else if(bill >= 5000 && bill <= 9999) {
			System.out.println("10% Discount");
		} else if(bill >= 10000) {
			System.out.println("20% Discount");
		}

	}

}
