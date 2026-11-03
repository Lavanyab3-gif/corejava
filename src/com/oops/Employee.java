package com.oops;

public class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}

class Contract extends Employee{

	double basePay;
	public Contract(int id, String name,double basePay) {
		super(id, name);
		this.basePay = basePay;
	}
	
}
