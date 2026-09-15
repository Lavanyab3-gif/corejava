package com.logicalStatements;

import java.util.Scanner;

public class TemperatureChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		int temp = sc.nextInt();
		if(temp < 0) {
			System.out.println("Freezing");
		} else if(temp >= 0 && temp <=15) {
			System.out.println("Very Cold");
		} else if(temp >= 16 && temp <= 25) {
			System.out.println("Cold");
		} else if(temp >= 26 && temp <=35) {
			System.out.println("Normal");
		} else if(temp >= 36 && temp <= 45) {
			System.out.println("Hot");
		} else if(temp >45) {
			System.out.println("Very hot");
		}
		else {
			System.out.println("There is no temp");
		}

	}

}
