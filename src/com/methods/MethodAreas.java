package com.methods;

public class MethodAreas {
	static int calculateArea(int length , int width) {
		int Rarea = length * width;
		return Rarea;
	}
	static double calArea(double radius) {
		double Carea = 3.14 * radius * radius;
		return Carea;
	}
	static double trianglearea(int breadth , int height) {
		double  Tarea = 0.5 * breadth * height;
		return Tarea;
	}
	static double pentagonearea(int perimeter , int apothem) {
		double Parea = 0.5 * perimeter * apothem;
		return Parea;
		
	}
	public static void main(String[] args) {
		int recarea = calculateArea(12,20);
		System.out.println("The area of rectangle is :"+recarea);
		
		double circlearea = calArea(4);
		System.out.println("The Area of the circle is: "+circlearea);
		
		double triarea = trianglearea(5,2);
		System.out.println("The area of the triangle is :"+triarea);

		double penarea = pentagonearea(6,3);
		System.out.println("The area of the pentagone is :"+penarea);
		
	}

}
