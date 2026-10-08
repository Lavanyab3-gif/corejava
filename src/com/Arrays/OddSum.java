package com.Arrays;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements:");
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i] % 2 !=0) {
				sum = sum + arr[i];
				
				
			}
		
		}
		System.out.println("The Sum of the Elements:"+sum);
		

	}

}
