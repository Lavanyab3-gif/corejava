package com.oops;

class Shape {
	private int len;
	private int br;

	public void area(int len, int br) {
		System.out.println("The area:" + (1 / 2) * (br) * (len));
	}
}

class Rectangle extends Shape {
	@Override
	public void area(int len, int br) {
		System.out.println("The area of reactangle is : " + (len * br));
	}
}

class Triangle extends Shape {
	public void area(int len, int br) {
		System.out.println("The area of Triangle is : " + ((1 / 2) * (br) * (len)));

	}
}

public class TestShape {

	public static void main(String[] args) {

		System.out.println("Main Method Started....");
		Triangle t = new Triangle();
		t.area(3, 3);

		Rectangle r = new Rectangle();
		r.area(2, 3);

	}

}
