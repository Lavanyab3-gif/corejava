package com.practice;
import java.util.Scanner;
public class Divisibleby5not10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i % 5 ==0 && i% 10 != 0)
			{
				System.out.println(i);
			}

	}

}}
