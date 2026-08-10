package com.practice;

import java.util.Scanner;

public class Sum {

	public void main(String[] args) {
		System.out.println("Sum of numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number:");
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		System.out.println("The sum of two numbers is :" + sum);

	}

}
