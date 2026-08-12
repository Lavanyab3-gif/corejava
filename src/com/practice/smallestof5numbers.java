package com.practice;
import java.util.Scanner;

public class smallestof5numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int small = a;
		if(b < small) {
			small = b;
		}else if(c< small) {
			small =c;
		}else if(d<small) {
			small = d;
		}
		else {
			small = e;
		}
		System.out.println("The smallest number is:"+small);
	}

}
