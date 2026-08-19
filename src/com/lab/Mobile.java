package com.lab;

public class Mobile {
	static String brand = "Vivo";
	String model;
	int price;
	int ram;
	static {
		System.out.println("welcome to company");
	}

	{
		System.out.println("New object is created");
	}
	static void details() {
		brand = "OPPO";
		
	}
	
	

	void display() {
		System.out.println("enter the Brand:" + brand);
		System.out.println("Enter the modelno:" + model);
		System.out.println("enter the price:" + price);
		System.out.println("enter the ram:" + ram);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Mobile Details");
		Mobile m1 = new Mobile();
		m1.model = "IQ00";
		m1.price = 20000;
		m1.ram = 256;
		m1.display();
		System.out.println("*******");

		Mobile m2 = new Mobile();
		m2.model = "V16";
		m2.price = 17000;
		m2.ram = 64;
		m2.display();
		System.out.println("********");
		

		Mobile m3 = new Mobile();
		m3.model = "MIA2";
		m3.price = 15000;
		m3.ram = 32;
		m3.display();

	}

}
