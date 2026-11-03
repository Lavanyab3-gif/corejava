package com.oops;

public class BankAccount {
	private String accountHolderName;
	private double salary;
	
	public void setName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getName() {
		return accountHolderName;
	}
	public void setSal(double salary) {
		this.salary = salary;
	}
	public double getSal() {
		return salary;
	}

}
