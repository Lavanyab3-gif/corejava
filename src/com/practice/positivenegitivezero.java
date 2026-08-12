package com.practice;
import java.util.Scanner;

public class positivenegitivezero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("positive");
		}
		else if(a<0){
			System.out.println("Negitive");
		}
		else {
			System.out.println("Neutral");
		}
	}

}
