package com.lab;

public class Employee {
	int Id;
	String name;
	double salary;

	Employee() {
		this(101);
		System.out.println("1-arg constructor called");
	}
	Employee(int Id){
		this(Id,"Sai");
		System.out.println("2-arg constructor callec");
	}

	Employee(int Id, String name) {
		this(Id, name, 356000);
		System.out.println("3-arg Constructor called");
	}

	Employee(int Id, String name, double salary) {
		this.Id = Id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Employee E1 = new Employee();
		E1.Employeeinfo();

		Employee E2 = new Employee(102,"Lavanya",23412);
		E2.Employeeinfo();

		System.out.println("Main method Ended");

	}

	void Employeeinfo() {
		System.out.println("Employee ID is:" + Id);
		System.out.println("Name of the Employee is:" + name);
		System.out.println("Salary of the Employee is:" + salary);
		System.out.println("------------------------");
	}

}
