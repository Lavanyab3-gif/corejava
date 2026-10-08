package com.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started!!");
		
		int[] marks = { 72, 70, 80, 85, 98 };
		
		int min = marks[0];
		
		int max = marks[0];
		
		for (int i = 1; i < marks.length; i++) {
			
			if (marks[i] <= min) {
				
				min = marks[i];
				
			} else if (marks[i] >= max) {
				
				max = marks[i];
				
			}
			
		}
		System.out.println("Minimum Marks are:" + min);
		
		System.out.println("Maximum Marks are:" + max);

		System.out.println("Main Method Ended!!");

	}

}
