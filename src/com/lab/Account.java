package com.lab;

public class Account {
	String name;
	int accno;
	int bal;
	String accStatus;
	static int accnum = 0;

	      {
		  accno = accnum;
		  accnum++;
 }
	void display() {
		System.out.println("Name is:" + name);
		System.out.println("Accno is:" + accno);
		System.out.println("Balance is :" + bal);
		System.out.println("Account Status is:" + accStatus);

	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.name = "Supraja";
		//a1.accno = accnum++;
		a1.bal = 30000;
		a1.accStatus = "Active";
		a1.display();

		Account a2 = new Account();
		a2.name = "Lavanya";
		//a2.accno = accnum++;
		a2.bal = 50000;
		a2.accStatus = "Active";
		a2.display();

	}

}
