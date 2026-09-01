package com.methods;

public class Autoboxing {

	public static void main(String[] args) {
//		autoboxing
		int a = 10;
		Integer i = a;
		System.out.println("primitive value is :" + a);
		System.out.println("Wrapper object is:" + i);
//		auto unboxing
		int b = i;
		System.out.println("value is:" + b);

	}

}
