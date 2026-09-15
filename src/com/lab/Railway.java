package com.lab;

import java.util.Scanner;

public class Railway {
	String passengerName;
	int age;
	String source;
	String destination;
	Railway(){
	}
	Railway(String passengerName){
		this();
		this.passengerName = passengerName;
	}
	Railway(String passengerName,int age){
		this(passengerName);
		this.age = age;
	}
	Railway(String passengerName,int age,String source){
		this(passengerName,age);
		this.source = source;
	}
	Railway(String passengerName,int age,String source,String destination){
		this(passengerName,age,source);
		this.destination = destination;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Passenger Name:");
		String passengerName = sc.nextLine();
		
		System.out.println("Enter Age:");
		int age  = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Source:");
		String source = sc.nextLine();
		
		System.out.println("Enter Destination:");
		String destination = sc.nextLine();
		
		System.out.println("Enter number of tickets:");
		int noOfTickets = sc.nextInt();
		
		Ticket t = new Ticket();
		t.bookTickets();
		t.displayBookingDetails();
		
	}

}
class Ticket extends Railway{
	int noOfTickets;
	static double price =500;
	Ticket(){
		this("Null",0,"NULL","NULL",0);
	}
	Ticket(String passengerName,int age,String source,String destination,int noOfTickets){
		super(passengerName,age,source,destination);
		this.noOfTickets = noOfTickets;	
	}
	void bookTickets() {
		double totalAmount = noOfTickets * price;
		System.out.println("Ticket Bokked Succussfully!!");
		
		
	}
	void displayBookingDetails() {
		System.out.println("Enter Passenger Name :"+passengerName);
		System.out.println("Enter Age:"+age);
		System.out.println("Enter Source:"+source);
		System.out.println("Enter Destination:"+destination);
		System.out.println("Number of Tickets:"+noOfTickets);
		System.out.println("Price per Ticket:"+price);
		System.out.println("Total Amount:"+(noOfTickets * price));
	} 
	
}
    class Main{
	
	public static void main(String[] args) {
//		Ticket t = new Ticket();
//		t.bookTickets();
//		t.displayBookingDetails();
		
	}
}
