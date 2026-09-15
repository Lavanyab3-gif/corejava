package com.lab;

import java.util.Scanner;

public class OnlineVoting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You are Eligible");
			System.out.println("Enter the Gender:");
			char gender = sc.next().charAt(0);
			if(gender == 'F' || gender == 'M' || gender =='f' || gender == 'm'){
				System.out.println("You are eligible for next step!! ");
				System.out.println("Enter Voter Id Number:");
				int voteId = sc.nextInt();
				
				System.out.println("Enter your choice:");
				System.out.println("1.ABC");
				System.out.println("2.PQR");
				System.out.println("3.KLM");
				System.out.println("4.XYZ");
				int choose = sc.nextInt();
				switch(choose) {
				case 1:
					System.out.println("You have succussfully voted for ABC ");
					break;
				
				case 2 :
					System.out.println("You have succussfully voted for PQR");
					break;
				
				case 3 :
					System.out.println("You have succussfully voted for KLM");
					break;
				
				case 4 :
					System.out.println("You have succussfully voted for XYZ");
					break;
				
				default :
					System.out.println("You are voted for NOTA");
				
				}
			}
				else {
					System.out.println("You are not eligible ");
				}
			}
			else {
				System.out.println("Ypur age is not matched");
			}
		}

	}


