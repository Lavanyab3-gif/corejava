package com.methods;

import java.util.Scanner;

public class MethodAge {
	int age;

	void eligible() {
		if (age > 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not Eligible");
		}

	}

	public static void main(String[] args) {
		MethodAge A = new MethodAge();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the candidate:");
		int age = sc.nextInt();
		A.age = age;
		A.eligible();

	}

}
