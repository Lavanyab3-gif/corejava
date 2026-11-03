package com.Arrays;

import java.util.Scanner;

public class SortingAscending {

	public static void main(String[] args) {
		
		int [] arr = {5,6,2,1,3,4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i] + " ");
		}
		System.out.println();
	}

}
