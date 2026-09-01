package com.methods;

import java.util.Scanner;

public class Method2 {
//	no return type with parameters
	void operations(int a, int b, int c, int d, int e) {
		int sum = a + b + c + d + e;
		System.out.println("sum is:" + sum);
		int diff = a - b - c - d - e;
		System.out.println("diff is:" + diff);
		int mul = a * b * c * d * e;
		System.out.println("mul is:" + mul);
		int div = a / b / c / d / e;
		System.out.println("div is :" + div);
	}

	public static void main(String[] args) {
		Method2 m = new Method2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		m.operations(a, b, c, d, e);

	}

}
