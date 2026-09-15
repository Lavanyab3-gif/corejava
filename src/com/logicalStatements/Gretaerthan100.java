package com.logicalStatements;

import java.util.Scanner;

public class Gretaerthan100 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		sc.close();
		if(n>100) {
			System.out.println("YES,Greater than 100!!");
		}
		else {
			System.out.println("NO,not Greater than 100!!");
		}

	}

}
