package com.lab;
import java.util.Scanner;

public class Loan {
	String customerName;
	double loanAmt;
	int rateofIntrest;
	static int timeinyears;

	double calculateIntrest(double loanAmt, float rateofIntrest) {
		double SI = (loanAmt * timeinyears * rateofIntrest) / 100;
		return SI;
	}

	double calculateTotalAmt(double SI) {
		double totalAmtpay = SI + loanAmt;
		return totalAmtpay;
	}

	double calculateMonthlyEMI(double totalAmtpay, int timeinyears) {
		int month = timeinyears * 12;
		double monthlyEMI = totalAmtpay / month;
		return monthlyEMI;
	}

	void displayLoansummary(double SI, double totalAmtpay, double EMI) {
		System.out.println("Welome to loan Amount Details");
		System.out.println("Enter the name of the customer:" + customerName);
		System.out.println("Enter the loan Amount:" + loanAmt);
		System.out.println("Enter the Rate of Intrest :" + rateofIntrest + "%");
		System.out.println("Enter the time in years:" + timeinyears);
		System.out.println("Simple Intrest is:" + SI);
		System.out.println("Total payable Amount is:" + totalAmtpay);
		System.out.println("Monthly EMI is:" + EMI);
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		Loan l = new Loan();
		l.customerName = "Lavanya";
		l.loanAmt = 400000;
		l.rateofIntrest = 10;
		timeinyears = 2;

		double totalIntrest = l.calculateIntrest(l.loanAmt, l.rateofIntrest);
		double totalAmount = l.calculateTotalAmt(totalIntrest);
		double emi = l.calculateMonthlyEMI(totalAmount, timeinyears);
		l.displayLoansummary(totalIntrest, totalAmount, emi);
		
		Loan l1 = new Loan();
		l1.customerName = "Lava";
		l1.loanAmt = 50000;
		l1.rateofIntrest = 10;
		timeinyears = 3;
		
		double totalIntrest1 = l1.calculateIntrest(l1.loanAmt, l1.rateofIntrest);
		double totalAmount1 = l1.calculateTotalAmt(totalIntrest1);
		double emi1 = l1.calculateMonthlyEMI(totalAmount1, timeinyears);
		l1.displayLoansummary(totalIntrest, totalAmount, emi1);
		
		
	}

}
