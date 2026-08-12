package com.practice;
import java.util.Scanner;

public class Numberistwodigitornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a>=10 && a<=99 )  {
			System.out.println("2 digit");
		}else if(a>=-10 &&a<=-99){
			System.out.println("2 digit");
		}else {
			System.out.println("no");
		}

	}

}
