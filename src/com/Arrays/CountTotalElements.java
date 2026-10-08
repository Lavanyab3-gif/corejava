package com.Arrays;
import java.util.Scanner;

public class CountTotalElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The count of Elements are:"+arr.length);
	

	}

}
