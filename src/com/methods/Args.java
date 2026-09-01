package com.methods;

import java.util.Scanner;

public class Args {
	static void display(int a, int b, int c, int d) {
		int sum = a + b + c;
		System.out.println("Sum is:" + sum);

	}

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbers you want:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + "value:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt(); 
		display(a, b, c, d);

	}

}
