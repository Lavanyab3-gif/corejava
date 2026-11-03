package com.Arrays;

public class MovingNegitiveNumbers {

	public static void main(String[] args) {
		int[] arr = { 7, -2, 4, 5, -3, -1, 0 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
