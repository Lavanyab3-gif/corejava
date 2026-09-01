package com.methods;

import java.util.Scanner;

public class Method4 {
//	return type without parameters
	static int a, b, c, d, e;

	static int add() {
		return a + b + c + d + e;
	}

	static int sub() {
		return a - b - c - d - e;
	}

	static int mul() {
		return a * b * c * d * e;
	}

	static int div() {
		return a / b / c / d / e;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		System.out.println("Addition is:" + add());
		System.out.println("Substitution is:" + sub());
		System.out.println("Multiplication is:" + mul());
		System.out.println("Division is:" + div());

	}

}
