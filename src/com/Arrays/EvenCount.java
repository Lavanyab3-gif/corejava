package com.Arrays;

import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the Array elements:");
		int count =0;
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
			if(arr[i] %2  == 0) {
				count ++;
				
			}
		}
		System.out.println("The Even count is:"+count);

	}

}
