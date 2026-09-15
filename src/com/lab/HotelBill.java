package com.lab;

import java.util.Scanner;

public class HotelBill {
	String roomType;
	int no_of_days;
	double roomPrice;
	double foodCharges;
	double finalBill;
	double roomCost;

	HotelBill() {

		System.out.println("no-arg Constructor Called");
	}

	HotelBill(String roomType) {
		this();
		this.roomType = roomType;

	}

	HotelBill(String roomType, int no_of_days) {
		this(roomType);
		this.no_of_days = no_of_days;
	}

	HotelBill(String roomType, int no_of_days, double roomPrice) {
		this(roomType, no_of_days);
		this.roomPrice = roomPrice;
	}

	HotelBill(String roomType, int no_of_days, double roomPrice, double foodCharges) {
		this(roomType, no_of_days, roomPrice);
		this.foodCharges = foodCharges;
		roomCost = this.roomPrice * this.no_of_days;
		finalBill = this.roomCost + this.foodCharges;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter room type:");
		String roomType = sc.nextLine();

		System.out.println("Enter number of days:");
		int no_of_days = sc.nextInt();
		
		System.out.println("Enter room price:");
		double roomPrice = sc.nextDouble();
		
		System.out.println("Enter Food Charges:");
		double foodCharges = sc.nextDouble();
		
		HotelBill h = new HotelBill(roomType, no_of_days, roomPrice, foodCharges);
		System.out.println("------------ HOTEL BILL -----------");

		h.display();
		sc.close();

	}

	void display() {
		System.out.println("Room Type:" + roomType);
		System.out.println("Room Price:" + roomPrice);
		System.out.println("Number of days:" + no_of_days);
		System.out.println("Food Charges:"+foodCharges);
		System.out.println("Room Cost:"+roomCost);
		System.out.println("Final Bill :"+finalBill);
	}
}
