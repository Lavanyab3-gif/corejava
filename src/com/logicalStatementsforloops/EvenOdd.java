package com.logicalStatementsforloops;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Even Numbers are:");
		for(int i=0;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("Odd Numbers are:");
		for(int i=1;i<=100;i++) {
			if(i % 2 == 1) {
				System.out.print(i +" ");
			}
		}

	}

}
