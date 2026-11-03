package com.Arrays;

import java.util.Scanner;

public class SumofAllPairsOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		boolean[] founded = new boolean[arr.length];
		System.out.println("Enter the target value:");
		int target = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(founded[i]) 
				continue;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]== target) {
					System.out.println("(" +arr[i]+" ,"+ arr[j] +")");
					founded[j]=true;
				}
			}
		}

	}

}
