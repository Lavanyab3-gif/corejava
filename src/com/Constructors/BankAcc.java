package com.Constructors;

public class BankAcc {
	int accNum;
	String holderName;
	double balance;
	String branch;
	double amount;
	BankAcc(){
		this(123456,"Lavanya") ;
	}
	BankAcc(int accNum,String holderName){
		this(accNum,holderName,50000.0);
		
	}
	BankAcc(int accNum, String holderName,double balance){
		this(accNum,holderName,balance,"Nivagam");
	}
	BankAcc(int accNum,String holderName,double balance,String branch){
		this.accNum = accNum;
		this.holderName = holderName;
		this.balance = balance;
		this.branch = branch; 
		
	}
	double deposite(double balance,double amount) {
		double bal = balance +amount;
		return bal;
	}
	double withdrawl(double bal,double amount) {
		double finalbal = bal - amount;
		return finalbal;
		
	}
	
	

	public static void main(String[] args) {
		BankAcc  a = new BankAcc();
		a.display();
		double balance =a.deposite(a.balance,3000);
		System.out.println("Balance:"+balance);
		double finalbalance = a.withdrawl(a.balance,2000);
		System.out.println("Final balance is:"+finalbalance);
		
		

	}
	void display() {
		System.out.println("Account Number :"+accNum);
		System.out.println("Holder Name :"+holderName);
		System.out.println("Balance :"+balance);
		System.out.println("Branch :"+branch);
	}

}
