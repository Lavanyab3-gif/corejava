package com.Constructors;

public class BankAccount {
	int account_number;
	String name;
	double balance;

	BankAccount() {
		this(101);

	}

	BankAccount(int account_number) {
		this(account_number, "Lavs");
	}

	BankAccount(int account_number, String name) {
		this(account_number, name, 50000);
	}

	BankAccount(int account_number, String name, double balance) {
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
	}

	void display() {
		System.out.println("Account Number is:" + account_number);
		System.out.println("Name of the candidate:" + name);
		System.out.println("Balance is:" + balance);
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.display();
		BankAccount b2 = new BankAccount(102, "Sai", 54321);
		b2.display();
		BankAccount b3 = new BankAccount(103, "Sudheer", 654321);
		b3.display();

	}

}
