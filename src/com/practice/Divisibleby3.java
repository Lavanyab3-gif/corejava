package com.practice;
import java.util.Scanner;

public class Divisibleby3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter m");
//		int m = sc.nextInt();
		System.out.println("enter n");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
