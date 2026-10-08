package com.Arrays;

import java.util.Scanner;

public class PrintArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements:");
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are:");
		for(int i =0;i<arr.length;i++)
		
			System.out.print(arr[i] +" ");
		
		
	}

}
