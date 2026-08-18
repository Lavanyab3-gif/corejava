package com.lab;

public class Emp {
	int empId;
	String empName;
	long salary;
	float experience;
	char grade;
	boolean perminantStatus;
	
	void display() {
		System.out.println("empId is :"+empId);
		System.out.println("empName is :"+empName);
		System.out.println("salary is :"+salary);
		System.out.println("experience is :"+experience);
		System.out.println("grade is :"+grade);
		System.out.println("perminantStatus :"+perminantStatus);
	
	}

	public static void main(String[] args) {
		System.out.println("*** Welcome to my compnay ***");
		Emp e1 = new Emp();
		e1.empId = 1;
		e1.empName= "Pujitha";
		e1.salary = 700000;
		e1.experience = 4.5f;
		e1.grade = 'A';
		e1.perminantStatus = true;
		e1.display();
		System.out.println("************");
		Emp e2 = new Emp();
		e2.empId = 2;
		e2.empName= "Durga";
		e2.salary = 500000;
		e2.experience = 1.6f;
		e2.grade = 'C';
		e2.perminantStatus = false;
		e2.display();
		System.out.println("************");
		Emp e3 = new Emp();
		e3.empId = 3;
		e3.empName= "Likki";
		e3.salary = 730000;
		e3.experience = 0.0f;
		e3.grade = 'A';
		e3.perminantStatus = true;
		e3.display();
		
		
		

	}

}
