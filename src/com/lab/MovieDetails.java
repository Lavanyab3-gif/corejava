package com.lab;

public class MovieDetails {
	int movieId;
	String movieName;
	String heroname;
	int availableSeats;
	static String  theaterName;
	static  String managerName;
	void displayMovieDetails() {
		System.out.println("MovieId is :"+movieId);
		System.out.println("Movie Name is :"+movieName);
		System.out.println("Hero Name is :"+heroname);
		System.out.println("Available Seats are:"+availableSeats);
	}
	void displaybookSeat() {
		availableSeats --;
		System.out.println("Remaining Seats are:"+availableSeats);
	}
	static void displayTheaterDetails() {
		System.out.println("Theater Name is :"+theaterName); 
		System.out.println("Manager Name is :"+managerName);
	}
	void changemanagername(){
		managerName = "sai";
	}

	public static void main(String[] args) {
		theaterName = "ALLU CINEMAS";
		managerName = "ALLU Arjun";
		
		MovieDetails m1 = new MovieDetails();
		m1.movieId = 101;
		m1.movieName= "Peddi";
		m1.heroname = "Ram Charan";
		m1.availableSeats = 23;
		displayTheaterDetails();
		m1.displayMovieDetails();
		m1.displaybookSeat();
		m1.changemanagername();
		displayTheaterDetails();
		

	}

}
