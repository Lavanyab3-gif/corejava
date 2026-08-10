package com.practice;
import java.util.Scanner;

public class Evenodd {
	

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = Sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		
		

	}

}
