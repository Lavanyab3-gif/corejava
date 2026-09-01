package com.methods;

import java.util.Scanner;

public class EvenorOdd {
	void Evenorodd(int n) {
		if (n % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}

	public static void main(String[] args) {
		EvenorOdd E = new EvenorOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:");
		int n = sc.nextInt();
		E.Evenorodd(n);

	}

} 
