package com.Arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the Elements:");
		int sum =0;
		double avg = 0;
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			sum = sum +arr[i];
			
		}
		avg = sum/arr.length;
		
		System.out.println("Sum of the Elements are:"+sum);
		System.out.println("Average of the Elements are:"+avg);

	}

}
