package com.Arrays;

public class Equalibrium {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 7, 3, 3, 1 };
		int totalSum = 0;
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {

			int right = i + 1;
			int left = i - 1;
			int rsum = 0;
			int lsum = 0;
			while (right < arr.length) {
				rsum += arr[right];
				right++;
			}
			while (left >= 0) {
				lsum += arr[left];
				left--;
			}

			if (lsum == rsum) {
				System.out.println(arr[i]);
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			totalSum -= arr[i];
//			if(totalSum == leftSum) {
//				System.out.println("Equilibrium Element is:"+arr[i]);	
//			}
//			leftSum += arr[i];
//			
//		}

	}

}
