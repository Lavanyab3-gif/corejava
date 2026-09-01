package com.methods;

public class Method {
	int rollNum;
	String name;
	double salary;
	float age;
	char gender;

	void displayDetail() {
		System.out.println("Roll_Number is:" + rollNum);
		System.out.println("Name of the candidate is:" + name);
		System.out.println("Monthly Salary is:" + salary);
		System.out.println("Age of the candidate is :" + age);
		System.out.println("Gender of the person is:" + gender);
	}

	public static void main(String[] args) {
		Method m = new Method();
		m.rollNum = 101;
		m.name = "Lavanya";
		m.salary = 12345;
		m.age = 21.2f;
		m.gender = 'f';
		m.displayDetail();

	}

}
