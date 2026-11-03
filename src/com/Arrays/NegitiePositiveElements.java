package com.Arrays;

import java.util.Scanner;

public class NegitiePositiveElements {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]< 0) {
				System.out.println("Negitive");
			}
			else if(arr[i]> 0) {
				System.out.println("Positive");
			}
			else {
				System.out.println("Zero");
			}
		}

	}

}
