package com.lab;

import java.util.Scanner;

public class MobileBill {
	String model;
	int quantity;
	double price;
	int deliveryCharge;

	MobileBill() {
		System.out.println("1-Arg Construtor called");
		this("Vivo");
	}

	MobileBill(String model) {
		System.out.println("2-Args Constructor called");
		this(model, 2);

	}

	MobileBill(String model, int quantity) {
		System.out.println("3-Args Constructor Called ");
		this(model, quantity, 30000);

	}

	MobileBill(String model, int quantity, double price) {
		System.out.println("4 args Constructor Called");
		this(model, quantity, price, 50);

	}

	MobileBill(String model, int quantity, double price, int deliveryCharge) {
		this.model = model;
		this.quantity = quantity;
		this.price = price;
		this.deliveryCharge = deliveryCharge;

	}

	public static void main(String[] args) {
		new MobileBill();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model name:");
		String model = sc.nextLine();
		System.out.println("Enter the quantity:");
		int quantity = sc.nextInt();
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		System.out.println("Enter the Delivery Charges:");
		int deliveryCharge = sc.nextInt();
		double mobileCost = price * quantity;
		System.out.println("Cost of the Mobile is:" + mobileCost);
		double finalBill = mobileCost + deliveryCharge;
		System.out.println("Total Bill of the Mobile is:" + finalBill);

	}

}
