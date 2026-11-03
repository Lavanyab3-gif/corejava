package com.oops;

public class BankAccount1 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		
		b1.setName("Lavanya");
		b1.setSal(35000);
		
		b1.setName("Pujitha");
		b1.setSal(40000);
		
		System.out.println(b1.getName());
		System.out.println(b1.getSal());
	}

}
