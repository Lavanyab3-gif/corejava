package com.practice;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("The multiplication of 3 numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("The first number is:");
		int n1 = sc.nextInt();
		System.out.println("The second number is:");
		int n2 = sc.nextInt();
		System.out.println("The third number is");
		int n3 = sc.nextInt();
		int mul = n1 * n2 * n3;
		System.out.println("The multiplication is :" + mul);

	}

}
