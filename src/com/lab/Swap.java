package com.lab;

import java.util.Scanner;

public class Swap {
	static int a;
	static int b;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
