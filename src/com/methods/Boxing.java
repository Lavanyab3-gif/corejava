package com.methods;

import java.util.Scanner;

public class Boxing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
//		Auto-boxing
		Integer A = a;
		Integer B = b;
		Integer C = c;
		Integer D = d;
		Integer E = e;
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println("************");

//		Auto-unboxing

		int k = A;
		int l = B;
		int m = C;
		int n = D;
		int o = E;

		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

	}

}
