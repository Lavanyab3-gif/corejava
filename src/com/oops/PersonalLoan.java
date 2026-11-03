package com.oops;

import java.util.Scanner;

	

public class PersonalLoan  extends Loan{
	// because ..used to access all the methods
	static Scanner sc = new Scanner(System.in);
	
	void getpersonalloanInfo() {
		System.out.println("Parent loan info..");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan Banking");
		
		
//		2> by using parent obj and parent ref
//		we can call ony parent class functionalities...
		Loan l1  = new Loan();
//		l1.getpersonalloanifo(); CE:The method getpersonalloanifo() is undefined for the type Loan
		
//		1> By usimg child object & child reference 
//		we can call both child and parent class functinalities..
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getAge();

		if (salary >= 100000.00 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Good to know Let's Start the remaining process..");

			if (pl.checkAadhar() && pl.checkPan() && pl.checkPhoneNum()) {
				System.out.println("Congratulations!! Your  Personal Loan Got Approved!!");
				System.out.println("Personal Loan ROI is:" + pl.getROI());

			} else {
				System.out.println("Somrthing went with ur data can you check once..");
			}
		} else {
			System.out.println("Your loan got rejected");
		}
	}

	
}
