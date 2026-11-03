package com.Arrays;

import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array elements:");
		int evenCount = 0;
		int oddCount =0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			else if(arr[i] % 2 !=0){
				oddCount++;
			}
		}
		System.out.println("The Even count is:" + evenCount);
		System.out.println("The Odd count is :"+oddCount);

	}

}
