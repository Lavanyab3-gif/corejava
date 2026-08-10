package com.practice;

public class Student {
	static String CollegeName;
	static String  Collegecode;

	int stuId;
	String stuName;
	int marks;
	String branch;
	void display() {
		System.out.println("CollegeName is :" +CollegeName);
		System.out.println("Collegecode is :" + Collegecode);
		System.out.println("stuId is : " + stuId);
		System.out.println("stuName is : " + stuName);
		System.out.println("marks are :" + marks);
		System.out.println("branch is :" + branch);
		
	}

	public static void main(String[] args) {
		System.out.println("Srudent Details");
		CollegeName = "Avanthi College";
		Collegecode = "AVEV";
		
		// TODO Auto-generated method stub
		Student s = new Student();
		s.stuId = 01;
		
		s.display();
		

	}

}
