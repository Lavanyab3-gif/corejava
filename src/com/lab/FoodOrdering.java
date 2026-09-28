package com.lab;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		
		double totalPrice = 0.0;
		String yn = "";
		
		System.out.println("Welcome to Zomato");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item:");
		String item = sc.next();
		System.out.println("Enter the Quantity:");
		int quantity = sc.nextInt();
		
		
		do {

		switch(item) {
		case "pizza" ->{
			System.out.println("The Price of the Pizza is 200/-");
			double pPrice = 200.0;
			totalPrice = quantity * pPrice;
		}
		case "bur" ->{
			System.out.println("The price of the Burger is 120/-");
			double bPrice = 120.0;
			totalPrice  = quantity * bPrice;
		}
		case "bir" ->{
			System.out.println("The Price of the Biryani is 180/-");
			double birPrice = 180.0;
			totalPrice = quantity * birPrice;
		}
		
		case "ndls" ->{
			System.out.println("The Price of the Noodles is 100/-");
			double nPrice = 100.0;
			totalPrice = quantity * nPrice;
		}
		default -> System.out.println("Entered item is not available now!!");
		}
		
		System.out.println("Do you want to continue enter Y otherwise enter N");
		yn = sc.next();
		

	} while(yn.equalsIgnoreCase("y"));
		System.out.println("Exit from the Zomato");
		System.out.println("Total Bill of your orders is :"+totalPrice);
		System.out.println("Thank you for vising ..!!");
		System.out.println("Visit Again..!!");
		
	}
}
