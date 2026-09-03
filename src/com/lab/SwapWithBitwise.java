package com.lab;

public class SwapWithBitwise {
	static int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		System.out.println("before swapiing");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
