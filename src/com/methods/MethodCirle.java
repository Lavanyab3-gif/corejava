package com.methods;

public class MethodCirle {
	static double calArea(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		double circlearea = calArea(4);
		System.out.println("The Area of the circle is: "+circlearea);
		
	}

}
