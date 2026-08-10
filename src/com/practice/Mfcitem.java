package com.practice;

import java.util.Scanner;

public class Mfcitem {
	static int item;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********MENU CARD********");
		System.out.println("1.Biryani - 250");
		System.out.println("2.Chiken - 150");	
		System.out.println("3.Mutton - 350");
		System.out.println("4.pizza - 120");
		System.out.println("5.panipuri - 40");
		System.out.println("Enter the item number:");

		item = sc.nextInt();
		
		if(item == 1) {
			System.out.println("Biryani - 250");
		}
		else if(item == 2){
			System.out.println("Chiken - 150");	
		}
		else if(item == 3) {
			System.out.println("Mutton - 350");
			
		}
		else if (item == 4) {
			System.out.println("pizza - 120");
		}
		else {
			System.out.println("panipuri - 40");
		}
		
	}

}
