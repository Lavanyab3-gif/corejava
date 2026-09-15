package com.lab;

import java.util.Scanner;

public class VegitableBilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Vcube market");
		double totalPrice = 0.0;
		double vegPrice = 0.0;
		double fruPrice = 0.0;
		
		System.out.println("Enter the Category:");
		String catg = sc.nextLine();
		switch (catg) {
		case "veg" -> {
			String vyn = "";

			do {
				System.out.println("Enter the item:");
				String item = sc.next();
				switch (item) {

				case "tmt" -> {
					System.out.println("The price of Tomato per kg is 35/- ");
					double tomatoPrice = 35.0;
					vegPrice = vegPrice + tomatoPrice;
				}
				case "ptt" -> {
					System.out.println("The prie of Potato per kg is 25/-");
					double potatoPrice = 25.0;
					vegPrice = vegPrice + potatoPrice;
				}
				default -> System.out.println("The Required vegitable is not Available here!!");
				}
				System.out.println("Do u want to continue this click Y otherwiese click N");
				vyn = sc.next();
			} while (vyn.equalsIgnoreCase("y"));
			
				System.out.println("Exit from veggies!!");
				System.out.println("Total Price of vegitables is :" + vegPrice);
			
		}
		case "fru" ->{
			
		}

		}
	}

}
