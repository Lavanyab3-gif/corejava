package com.lavanya;

public class Cricketer {
//	Static Variables
	static int CountryId;
	static String CountryName;
	
//	Instance variable
	int jersyNumber;
	String CricketerName;
	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team");
		CountryName = "India";
		CountryId = 91;
		System.out.println("CountryId is :" + CountryId);
		System.out.println("CountryName is :" + CountryName);
		Cricketer c1 = new Cricketer();
		c1.CricketerName = "Dhoni";
		c1.jersyNumber = 7;
	    System.out.println(c1.jersyNumber);
	    System.out.println(c1.CricketerName);
		
		

	}

}
