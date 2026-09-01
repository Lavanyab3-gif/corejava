package com.methods;

public class MethodRecArea {
	static int calculateArea(int length , int width) {
		int area = length * width;
		return area;
		
	}

	public static void main(String[] args) {
		int recarea = calculateArea(12,20);
		System.out.println("The area of rectangle is :"+recarea);
		
	}

}
