package com.Arrays;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int []num = new int[n];
		System.out.println("Enter Array Elements:");
		
		for(int i = 0;i<=n;i++) {
			num[i]=sc.nextInt();
		
			System.out.println("Reverse of an array is:");
			for(int j = n-1;j>0;j--) {
				System.out.print(num[j]+ " ");
			}
		}
	}

}
