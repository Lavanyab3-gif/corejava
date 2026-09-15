package com.logicalStatements;

import java.util.Scanner;
import java.lang.String;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time:");
		int  time = sc.nextInt();
		
		if(time<=6) {
			System.out.println("Good Morning");
		} else if(time >6 && time <=8) {
			System.out.println("Thini Institute ki Vellu");
		} else if(time > 8  && time <= 12) {
			System.out.println("Focus Chai");
		} else if(time > 12 && time <=13) {
			System.out.println("Lunch");
		} else if(time > 13 && time <= 14) {
			System.out.println("Relax or give rest to brain");
		} else if(time > 14 && time <=16) {
			System.out.println("Java Practice");
		} else if(time > 16 && time <=18) {
			System.out.println("Practice SQL");
		} else if(time > 18 && time <=19 ) {
			System.out.println("Soft Skills Practice");
		} else if(time > 19 && time <= 20) {
			System.out.println("To Spend time Family");
		} else if(time > 20 && time <=21) {
			System.out.println("Dinner");
		} else if(time > 21 && time < 22) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Time Pass");
		}
	}

}
