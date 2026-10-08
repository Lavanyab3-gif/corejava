package com.Arrays;

import java.util.Scanner;

public class MinMaxUsingMethod {
	static void minmax(int[]n) {
		int min =n[0];
		int max = n[0];
		for(int n1 : n) {
			if(n1<min) {
				min = n1;
			} else if(n1>max) {
				max = n1;
			}
		}
			System.out.println("Min Element is:"+min);
			System.out.println("Max Element is:"+max);
			
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements based on the size:" + size);
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		minmax(arr);
		System.out.println("Main method Ended");

	}

}
