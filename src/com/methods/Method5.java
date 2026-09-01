package com.methods;

public class Method5 {
	static int  getSquare() {
		int n = 12;
		int square = n * n;
		return square;
	}

	public static void main(String[] args) {
		int sqr = getSquare();
		System.out.println("The square of the is:"+sqr);
		
	}

}
