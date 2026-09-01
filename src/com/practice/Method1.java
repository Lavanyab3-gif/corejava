package com.practice;

import java.util.Scanner;

public class Method1 {
//	no parameters and no return type
	static int a,b,c,d,e;
	static void add() {	
		int sum = a+b+c+d+e;
		System.out.println("Addition is :"+sum);
		int diff = a-b-c-d-e;
		System.out.println("Differece is :"+diff);
		int mul = a*b*c*d*e;
		System.out.println("Multiplication is:"+mul);
		int div = a/b/c/d/e;
		System.out.println("Division is:"+div);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values:");
		a = sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		add();
	}

}
