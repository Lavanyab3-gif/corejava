package com.methods;

public class Method6 {
	static int findMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int max = findMax(4, 9);
		System.out.println("Maximum number is:" + max);

	}

}
