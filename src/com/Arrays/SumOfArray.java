package com.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum =0;
		int avg = 0;
		for(int n:arr) {
			sum = sum +n;
		}
		avg = sum / arr.length;
		System.out.println("Total sum is:"+sum);
		System.out.println("The Average is:"+avg);

	}

}
