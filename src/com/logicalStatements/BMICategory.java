package com.logicalStatements;

import java.util.Scanner;

public class BMICategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BMI :");
		float BMI = sc.nextFloat();
		if(BMI < 18.5) {
			System.out.println("Underweight");
		} else if(BMI >= 18.5 && BMI <= 24.9) {
			System.out.println("Normal");
		} else if(BMI >=25 && BMI <= 29.9) {
			System.out.println("Overweight");
		} else if(BMI >= 30) {
			System.out.println("Obese");
		}

	}

}
