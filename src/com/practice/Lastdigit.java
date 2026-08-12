package com.practice;
import java.util.Scanner;

public class Lastdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int b= n % 10;
		if(b % 2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
