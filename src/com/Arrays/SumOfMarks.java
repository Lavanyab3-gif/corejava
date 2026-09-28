package com.Arrays;

public class SumOfMarks {

	public static void main(String[] args) {
		int [] marks = {60,70,75,80,85,98};
		int sum = 0;
		int avg =0;
		for(int i =0;i<marks.length;i++) {
			sum = sum +marks[i];
		}
			System.out.println("The sum of marks is:"+sum);
		

	}

}
