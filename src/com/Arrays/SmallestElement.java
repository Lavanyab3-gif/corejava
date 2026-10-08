package com.Arrays;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the array elements:");
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The Smallest Element is:"+min);

	}

}
