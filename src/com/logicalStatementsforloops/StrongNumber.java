package com.logicalStatementsforloops;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int r;
		int temp = n;
		
		 int sum = 0;
		 while(n>0) {
			 r = n % 10;
			 int fact = 1;
		 for(int i=1;i<=r;i++) {
			 fact = fact * i;
		 }
		 sum = sum +fact;
		 n = n /10;	  
	}
		 if(sum == temp) {
			 System.out.println("Strong number");
		 }
		 else {
			 System.out.println("Not Strong Number");
		 }
	}
}
