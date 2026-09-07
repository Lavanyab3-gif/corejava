package com.Constructors;

public class Vehicle {
	String model;
	String brand;
	double price;
	String color;
	Vehicle(){
		System.out.println("Constructor Called");
	}

	public static void main(String[] args) {
		System.out.println("Main method started from Vehical class!!");
		

	}
	class Bike extends Vehicle{
		Bike(){
			System.out.println("Constructor Called");
		}
		public static void main(String[] args) {
			System.out.println("Main method Started from Bike Class");
			
		}
	}

}
