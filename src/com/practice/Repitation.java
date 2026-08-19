package com.practice;

public class Repitation {
	static int n = 1232;

	public static void main(String[] args) {
		for (int i = 0; i <= n; i++) {
			int count = 0;
			int temp = n;
			while (temp > 0) {
				int num = temp % 10; 
				if (num == i) {
					count++;

				}
				temp = temp / 10;
			}
			if (count > 1) {
				System.out.println("Repeated no:" + i);
			}

		}

	}
}
