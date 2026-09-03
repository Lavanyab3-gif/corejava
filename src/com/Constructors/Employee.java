package com.Constructors;

public class Employee {
	int empId;
	String empName;
	String department;
	double salary;
	String location;

	Employee() {
		this(0, "unknown");

	}

	Employee(int empId, String empName) {
		this(empId, empName, "Not Assigned");

	}

	Employee(int empId, String empName, String department) {
		this(empId, empName, department, 0.0);

	}

	Employee(int empId, String empName, String department, double salary) {
		this(empId, empName, department, salary, "Not Assigned");

	}

	Employee(int empId, String empName, String department, double salary, String location) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
		this.location = location;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("-------Employee 1--------");
		e1.displayEmployee();

		Employee e2 = new Employee(101, "Sudheer", "Not Assigned", 0.0, "India");
		System.out.println("-------Employee 2--------");
		e2.displayEmployee();

		Employee e3 = new Employee(102, "Rahul", "Testing", 35000.0, "India");
		System.out.println("-------Employee 3--------");
		e3.displayEmployee();

		Employee e4 = new Employee(103, "Anil", "Development", 50000.0, "Hyderabad");
		System.out.println("-------Employee 4--------");
		e4.displayEmployee();

	}

	void displayEmployee() {
		System.out.println("Employee ID:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Department:" + department);
		System.out.println("Salary:" + salary);
		System.out.println("Location:" + location);
		System.out.println("");
	}

}
