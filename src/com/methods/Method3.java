package com.methods;
import java.util.Scanner;


public class Method3 {
//	with parameters , with return type
	int add (int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
		}
		int sub (int a, int b, int c, int d, int e) {
			return a-b-c-d-e;
	}
		int mul (int a, int b, int c, int d, int e) {
			return a*b*c*d*e;
		}
		int div (int a, int b, int c, int d, int e) {
			return a/b/c/d/e;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		Method3 m3 = new Method3();
		int sum = m3.add(a, b, c, d, e);
		System.out.println("Sum :"+sum);
		int sub = m3.sub(a, b, c, d, e);
		System.out.println("Sub is :"+sub);
		int mul = m3.mul(a, b, c, d, e);
		System.out.println("mul is :"+mul);
		int div = m3.div(a, b, c, d, e);
		System.out.println("Div is :"+div);
		
	}

}
