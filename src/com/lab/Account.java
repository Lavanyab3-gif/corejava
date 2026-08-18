package com.lab;

public class Account {
	String name;
	int accno;
	int bal;
	String accStatus;
	static int accnum = 1;

//	 Account(){
//		  accno = accnum;
//		  accnum++;
//	 }
	void display() {
		System.out.println("Name is:" + name);
		System.out.println("Accno is:" + accno);
		System.out.println("Balance is :" + bal);
		System.out.println("Account Status is:" + accStatus);

	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.name = "Supraja";
		a1.accno = accnum++;
		a1.bal = 10000;
		a1.accStatus = "Active";
		a1.display();

		Account a2 = new Account();
		a2.name = "Supraja";
		a2.accno = accnum++;
		a2.bal = 10000;
		a2.accStatus = "Active";
		a2.display();

	}

}
