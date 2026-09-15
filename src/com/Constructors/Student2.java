 package com.Constructors;

public class Student2 {
	String name;
	int age;
	Student2(){
		this("Unknown",0);
	}
	Student2(String name,int age){
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.display();
	}
	void display() {
		System.out.println("Enter Name:"+name);
		System.out.println("Age :"+age);
	}
	

}
