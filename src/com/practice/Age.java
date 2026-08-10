package com.practice;
import java.util.Scanner;

public class Age {
	 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:"); 
		int Age = sc.nextInt();
		
		if (Age > 18) {
			System.out.println("You are Eligible for vote");
		}
		else {
			System.out.println("Not eligible");
		}
		
		
			
		
		

	}

}
