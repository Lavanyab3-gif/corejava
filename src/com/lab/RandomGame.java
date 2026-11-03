package com.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" You have 3 chances let's Enter your First Number:");

		Random rd = new Random();
		int x = rd.nextInt(1, 3);

		for (int i = 1; i < 4; i++) {
			int n = sc.nextInt();
			if (n == x) {
				System.out.println("Congratulations, You won!!");
				break;
			} else if (i == 3) {
				System.out.println("You lost,Better Luck next Time");
				break;
			} else {
				System.out.println("Try again");
			}
			System.out.println("Enter the number:");

		}

	}

}
