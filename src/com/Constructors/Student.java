 package com.Constructors;

public class Student {

	String name;
	int age;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student s = new Student();
		s.name = "Lavanya";
		s.age = 21;
		System.out.println("Name :"+s.name);
		System.out.println("Age :"+s.age);
		
		
	}

}
