package com.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You hae only 3 chances!!!");
				
		System.out.println("Enter the number:");
		
		Random rd = new Random();
		int x = rd.nextInt(1,50);
		
		int count = 0;
		
		while(count<3) {
			count++;
			int n = sc.nextInt();
			if(n == x) {
				System.out.println("Congratulations !! You won the game");
				break;
			} else if(n<x) {
				System.out.println("Entered number is less than the random number!! Try again..");
			} else {
				System.out.println("Entered number is greaterthan the reandom number...!!");
			
			}
			if(count == 3) {
				System.out.println("You lost the game !! The random nuber is:"+x);
			}
		}

	}
   
}
