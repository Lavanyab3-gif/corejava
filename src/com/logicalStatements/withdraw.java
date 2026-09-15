package com.logicalStatements;

import java.util.Scanner;

public class withdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the money to withdraw:");
		double money = sc.nextDouble();
		if(money <= 20000) {
			System.out.println("Yes you can withdraw");
		}
		else {
			System.out.println("You are not able to withdraw");
		}

	}

}
