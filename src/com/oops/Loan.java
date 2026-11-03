package com.oops;

import java.util.Scanner;

public class Loan {

	Scanner sc = new Scanner(System.in);

	Double getSalary() {
		System.out.println("Enter the Salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	int getAge() {
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		return age;
	}

	int getCibilScore() {
		System.out.println("Enter the Cibil Score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		double roi = 0;
		int cibil = getCibilScore();

		if (cibil > 800 && cibil <= 900) {
			System.out.println("Excellent: strong Credit Profile");
			roi = 9.0;
		} else if (cibil > 770 && cibil <= 800) {
			System.out.println("Very good: High Approval Chances");
			roi = 9.5;
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("Good: Eligible");
			roi = 10.0;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("Average: May get loans but higher ROI");
			roi = 12.5;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor: Application may Rejected");
			roi = 14.0;
		} else {
			System.out.println("Invalid Cibil");

		}

		return roi;
	}

	boolean checkAadhar() {
		System.out.println("Enter Your aadhar Number:");
		String aadhar = sc.next();
		boolean astatus = aadhar.matches("[2-9]{1}[0-9]{11}");
		return astatus;
	}

	boolean checkPan() {
		System.out.println("Enter Your PAN Number:");
		String pan = sc.next();
		boolean pstatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return pstatus;
	}

	boolean checkPhoneNum() {
		System.out.println("Enter Your Phone  Number:");
		String phn = sc.next();
		boolean pnstatus = phn.matches("[6-9]{1}[0-9]{9}");
		return pnstatus;
	}

}
