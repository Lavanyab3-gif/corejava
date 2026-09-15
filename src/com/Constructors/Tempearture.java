package com.Constructors;

import java.util.Scanner;

public class Tempearture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Qualifiation");
		String qualification = sc.nextLine();
		if(qualification.equals("BTech/Degree")) 
		{
			System.out.println("Your Qualification matches to this job ");
			System.out.println("Enter Backlogs:");
			int backlog = sc.nextInt();
		if(backlog == 0) {
			System.out.println("Go to next step");
			
		}
			
		}
		else {
			System.out.println("Your Qualification should not match ");
			
		}
	}

}
