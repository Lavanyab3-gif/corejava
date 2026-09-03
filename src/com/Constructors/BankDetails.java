package com.Constructors;

public class BankDetails {
	String branch;
	double accountno;
	double balance;

	BankDetails() {
		this("Unknown", 123456);
		System.out.println("2-arg constructor called");

	}

	BankDetails(String branch, double accountno) {
		this(branch, accountno, 23455);
		System.out.println("3-arg constructor called");
	}

	BankDetails(String branch, double accountno, double balance) {
		this.branch = branch;
		this.accountno = accountno;
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankDetails b = new BankDetails();
		b.display();
		BankDetails b1 = new BankDetails("Kotturu", 23432123, 987654);
		b1.display();
		BankDetails b2 = new BankDetails("Srikakulam", 589122, 403030);
		b2.display();
		BankDetails b3 = new BankDetails("Vishakapatnam", 135790, 246810);
		b3.display();
		BankDetails b4 = new BankDetails("Hyderabad", 98181043, 9000000);
		b4.display();

	}

	void display() {
		System.out.println("Branchis:" + branch);
		System.out.println("Account number is:" + accountno);
		System.out.println("Balance is:" + balance);
		System.out.println("-----------------------");
	}

}
