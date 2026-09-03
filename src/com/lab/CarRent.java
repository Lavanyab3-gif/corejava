package com.lab;

import java.util.Scanner;

public class CarRent {
	
	int no_of_days;
	String compname(String compname) {
		return compname;
	}
	int fixedrent(int Fixedrent) {
		return Fixedrent;
	}
	int baserentalcost(int fixedrent , int no_of_days) {
		int rent = fixedrent * no_of_days;
		return rent;
	}
	int insurance(int fixedIns) {
		return fixedIns;
	}
	int totalcost(int fixedIns , int rent) {
		int totalcost = fixedIns+rent;
		return totalcost;
		
	}

	public static void main(String[] args) {
		System.out.println("*****WELCOME TO ZOOM CAR SERVICES****");
		CarRent c = new CarRent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of days:");
		int days= sc.nextInt();
		String Comname = c.compname("Tvs");
		System.out.println("compant name is:"+Comname);
		int FixedRent = c.fixedrent(1500);
		System.out.println("Fixed rent is:"+FixedRent);
		int BaseRent = c.baserentalcost(FixedRent, days);
		System.out.println("BaseRent is:"+BaseRent);
		int FixedInsurance = c.insurance(500);
		System.out.println("Fixed insurance is:"+FixedInsurance);
		int TotalRent = c.totalcost(FixedInsurance, BaseRent);
		System.out.println("The total Rent is:"+TotalRent);
		
				
		
		
		

	}

}
