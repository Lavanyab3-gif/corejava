package com.practice;
import java.util.Scanner;

public class Mton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter m");
		System.out.println();	
		int m = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=m; i<=n;i++) { 
			sum = sum + i;}
			System.out.println("Sum = :" + sum);
		}
		
		

	}


