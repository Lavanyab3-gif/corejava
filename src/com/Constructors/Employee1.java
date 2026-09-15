package com.Constructors;

public class Employee1 {
	int id;
	String name;
	double salary;
	Employee1(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1(0, null, 0.0);
		e.info();
		

	} 
	void info() {
		
	System.out.println("Employee ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	}

}
