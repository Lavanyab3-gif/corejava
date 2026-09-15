package com.Constructors;

import java.util.Scanner;

public class ElectricityBill {
	String customerName;
	int unitsConsumed;
	int costPerUnit;
	double serviceCharges;
	double energyCost;
	double finalBill;
	ElectricityBill(){
		System.out.println("no-arg constructor called");
	}
	ElectricityBill(String customerName){
		this();
		this.customerName = customerName;
		
	}
	ElectricityBill(String customerName,int unitsConsumed){
		this(customerName);
		this.unitsConsumed = unitsConsumed;
	}
	ElectricityBill(String customerName,int unitsConsumed,int costPerUnit){
		this(customerName,unitsConsumed);
		this.costPerUnit = costPerUnit;
	}
	ElectricityBill(String customerName,int unitsConsumed,int costPerUnit,double serviceCharge){
		this(customerName,unitsConsumed,costPerUnit);
		this.serviceCharges = serviceCharge;
		this.energyCost = this.unitsConsumed  * this.costPerUnit;
		this.finalBill = this.energyCost + this.serviceCharges;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name:");
		String customerName = sc.nextLine();
		
		System.out.println("Enter Units Consumed:");
		int unitsConsumed = sc.nextInt();
		
		System.out.println("Enter Cost Per Unit:");
		int costPerUnit = sc.nextInt();
		
		System.out.println("Enter Service Charges");
		double serviceCharges = sc.nextDouble();
		
		ElectricityBill e = new ElectricityBill(customerName,unitsConsumed,costPerUnit,serviceCharges);
		e.billDetails();
		sc.close();
		
	}
	void billDetails() {
		System.out.println("Customer Name :"+customerName);
		System.out.println("Units Consumer:"+unitsConsumed);
		System.out.println("Cost per unit:"+costPerUnit);
		System.out.println("Service Charges:"+serviceCharges);
		System.out.println("Energy cost:"+energyCost);
		System.out.println("Final Bill:"+finalBill);
	}

}
