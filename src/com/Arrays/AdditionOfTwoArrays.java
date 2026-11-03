package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the size of 2nd array:");
		int m = sc.nextInt();
		int [] b = new int [m];
		
		System.out.println("Enter the elements for first array:");
		for(int i =0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the elements for second array:");
		for(int i =0; i<m;i++) {
			b[i] = sc.nextInt();
	}
		int [] c = new int[n+m];
//		for(int i =0;i< n;i++) {
//			c[i] = a[i]; 
//		}
//		for(int i =0;i< m ; i++) {
//			c[n+i]=b[i];
//		}
		for(int i =0;i<n;i++) {
			c[i] = a[i]+b[i];
			System.out.println(c[i]);
		}
		
//		System.out.println(Arrays.toString(c));
	}
	

}
