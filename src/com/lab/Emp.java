package com.lab;

public class Emp {
	int Id;
	String companyName;
	double salary;

	Emp(int Id, String companyName, double salary) {
		this.Id = Id;
		this.companyName = companyName;
		this.salary = salary;

	}

	public static void main(String[] args) {
		Emp e = new Emp(101, "Infosys", 40000);
		e.display();
		Emp e1 = new Emp(102, "TCS", 500000);
		e1.display();
	}

	void display() {

		System.out.println("Id is:" + Id);
		System.out.println("Name of the employee is: " + companyName);
		System.out.println("Salary is:" + salary);
		System.out.println("-------------------");

	}

}
