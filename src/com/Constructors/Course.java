package com.Constructors;

import java.util.Scanner;

public class Course {
	String studentName;
	String courseName;
	int duration;
	double coursefee;
	double examFee;
	double finalFee;
	Course(){
		System.out.println("no-arg Constructor Called");
	}
	Course(String studentName){
		this();
		this.studentName = studentName;
	}
	Course(String studentName,String courseName){
		this(studentName);
		this.courseName = courseName;
	}
	Course(String studentName,String courseName,int duration){
		this(studentName,courseName);
		this.duration = duration;
	}
	Course(String studentName,String courseName,int duration,double coursefee){
		this(studentName,courseName,duration);
		this.coursefee = coursefee;
	}
	Course(String studentName,String courseName,int duration,double coursefee,double examFee){
		this(studentName,courseName,duration,coursefee);
		this.examFee = examFee;
		this.finalFee = coursefee + examFee;
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String studentName = sc.nextLine();
		
		System.out.println("Enter CourseName:");
		String courseName = sc.nextLine();
		
		System.out.println("Enter Duration:");
		int duration = sc.nextInt();
		
		System.out.println("Enter Course Fee:");
		double coursefeePerYear = sc.nextDouble();
		
		System.out.println("Enter Exam Fee:");
		double examFee = sc.nextDouble();
		Course c = new Course( studentName, courseName, duration,coursefeePerYear,examFee);
		c.display();
		sc.close();
	}
	void display() {
		System.out.println("Student Name:"+studentName);
		System.out.println("Course Name:"+courseName);
		System.out.println("Duration:"+duration);
		System.out.println("Course Fee:"+coursefee);
		System.out.println("Exam Fee:"+examFee);
		System.out.println("Final Fee:"+finalFee);
	}

}
