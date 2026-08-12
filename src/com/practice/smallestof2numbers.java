package com.practice;
import java.util.Scanner;

public class smallestof2numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value ");
		int a= sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		if(a<b) {
			System.out.println("a is smaller");
		}
		else {
			System.out.println("b is smaller");
		}
	}

}
