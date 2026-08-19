package com.Arrays;

public class Repitation {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,1,6,8,7,5,8};
		for (int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Repeated numbers : " + arr[i]);
				}
			}
		

	}

}}
