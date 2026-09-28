package com.lab;

import java.util.Scanner;

public class Divisibleby3and5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n= sc.nextInt();
		int sum =0;
		for(int i =0; i<=n;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("The Sum of the numbers is:"+sum);

	}

}
