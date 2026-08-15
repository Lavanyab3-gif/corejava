package com.lab;

public class Movie {
	String movieName;
	int releasedYear;
	int ticketPrice;

	void display() {
		System.out.println("movieName:" + movieName);
		System.out.println("releasedYear:" + releasedYear);
		System.out.println("ticketPrice:" + ticketPrice);
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.movieName = "RRR";
		m1.releasedYear = 2022;
		m1.ticketPrice = 250;
		m1.display();

		Movie m2 = new Movie();
		m2.movieName = "Peddi";
		m2.releasedYear = 2026;
		m2.ticketPrice = 350;
m2.display();
		
		Movie m3 = new Movie();
		m3.movieName = "DC";
		m3.releasedYear = 2026;
		m3.ticketPrice = 300;
		m3.display();

	}

}
