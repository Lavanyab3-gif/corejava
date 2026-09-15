package com.practice;

import java.util.Scanner;

public class MovieTicketBill {
	String movieName;
	double ticketPrice;
	int numberOfTickets;
	double foodCharges;
	double finalBill;
	double totalTicketsCost;

	MovieTicketBill() {
		System.out.println("No-Arg Constructor Called");
	}

	MovieTicketBill(String movieName) {
		this();
		this.movieName = movieName;
	}

	MovieTicketBill(String movieName, double ticketPrice) {
		this(movieName);
		this.ticketPrice = ticketPrice;
	}

	MovieTicketBill(String movieName, double ticketPrice, int numberOfTickets) {
		this(movieName, ticketPrice);
		this.numberOfTickets = numberOfTickets;
	}

	MovieTicketBill(String movieName, double ticketPrice, int numberOfTickets, double foodCharges) {
		this(movieName, ticketPrice, numberOfTickets);
		this.foodCharges = foodCharges;
		this.totalTicketsCost = this.ticketPrice * this.numberOfTickets;
		this.finalBill = this.totalTicketsCost + this.foodCharges;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter Movie Name:");
		String movieName = sc.nextLine();

		System.out.println("Enter Ticket Price:");
		double ticketPrice = sc.nextDouble();

		System.out.println("Enter Number of Tickets:");
		int numberOfTickets = sc.nextInt();

		System.out.println("Food Charges:");
		double foodCharges = sc.nextDouble();

		MovieTicketBill m = new MovieTicketBill(movieName, ticketPrice, numberOfTickets, foodCharges);
		m.display();

	}

	void display() {
		System.out.println("Movie Name:" + movieName);
		System.out.println("Ticket price:" + ticketPrice);
		System.out.println("No of Tickets:" + numberOfTickets);
		System.out.println("Food Charges:" + foodCharges);
		System.out.println("Total Cost:" + totalTicketsCost);
		System.out.println("Final Bill" + finalBill);
	}

}
