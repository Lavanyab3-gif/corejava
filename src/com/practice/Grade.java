package com.practice;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  subject1 marks:");
		int s1 = sc.nextInt();
		System.out.println("enter subject2 marks:");
		int s2 = sc.nextInt();
		System.out.println("Enter subject3 marks:");
		int s3 = sc.nextInt();
		System.out.println("Enter subject 4 marks:");
		int s4 = sc.nextInt();
		System.out.println("Enter subject 5 marks:");
		int s5 = sc.nextInt();
		System.out.println("Enter subject 6 marks:");
		int s6 = sc.nextInt();
		if(s1>=40 && s2>=40 && s3>=40 && s4>=40 && s5>=40 && s6>=40) {
			int total = s1+s2+s3+s4+s5+s6;
			System.out.println("Total marks =" + total+"/600");
			if (total >= 540) {
				System.out.println("Your grade is A and Congratulations! you got passed in 1st division ");
			}
			else if (total >=490) {
				System.out.println("Your grade is B and Congratulations! you got passed in 1st division ");
			}
			else if (total >= 360) {
				System.out.println("Your grade is C and Congratulations! you got passed in 1st division ");
						
			}
			else if (total >= 250) {
				System.out.println("Your grade is D");
			}
			else if (total >= 240) {
				System.out.println("your grade is E");
			}
			else {
				System.out.println("Failed");
			}
		}
			else {
				System.out.println("Failed");
			}
		
				
		

	}

}
