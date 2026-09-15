package com.Constructors;

public class Student3 {
	int sid;
	String sname;
	
	public Student3() {
		System.out.println("No - Arg onstrutor called ");
	}
	Student3(Student3 stu){
		this.sid = stu.sid;
		this.sname = stu.sname;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Student3 s = new Student3();
		s.sid = 101;
		s.sname = "Lavanya";
		s.disply();
		
		Student3 s1 = new Student3(s);
		s1.disply();
		
		System.out.println(s);
		System.out.println(s1);

	}
	void disply() {
		System.out.println("Student Id is:"+sid);
		System.out.println("Student name is:"+sname);
	}

}
