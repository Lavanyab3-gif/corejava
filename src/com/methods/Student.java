package com.methods;

public class Student {
	String stuName;
	float total_marks;
	int total_Subs;

	 double calAvg(float total_marks, int total_subs) {
		float Avg = total_marks / total_subs;
		return Avg;
	}

	void checkResults(double Avg) {
		if (Avg >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	void displayDetails(double Avg) {
//		System.out.println("***** WELCOME TO STUDENT DETAILS ****** ");
		System.out.println("Name of the Student is:" + stuName);
		System.out.println("Marks of the Student is:" + total_marks);
		System.out.println("Total subjects are:" + total_Subs);
		System.out.println("Average marks are:" + Avg);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student s = new Student();
		s.stuName = "Durga";
		s.total_marks = 460;
		s.total_Subs = 6;

		double average = s.calAvg(s.total_marks, s.total_Subs);
//		System.out.println("The average is :" + average);

		s.checkResults(average);
		s.displayDetails(average);

	}

}
