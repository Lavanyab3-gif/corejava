package com.lavanya;

public class Employee {
//	Static variables
	static String DepartmentName;
	static String Location;
// Instance variable
	int EmpId;
	String Name;
	Integer mobile;
	String Email;

	public static void main(String[] args) {
		System.out.println("Welocome to Employee World......");
		DepartmentName = "JFS";
		Location = "JNTU";
		System.out.println("Department is :" + DepartmentName);
		System.out.println("Location is : " + Location);

		System.out.println("............Object1 Info..............");

		Employee lav = new Employee();
		lav.EmpId = 1;
		lav.Name = "Lavanya";
		lav.mobile = 688201;
		lav.Email = "nululavanya@gmail.com";
		System.out.println(lav.EmpId);
		System.out.println(lav.Name);
		System.out.println(lav.mobile);
		System.out.println(lav.Email);

		System.out.println("............Object2 Info..............");

		Employee E1 = new Employee();
		E1.EmpId = 2;
		E1.Name = "Durga";
		E1.mobile = 248336;
		E1.Email = "durga@gmail.com";
		System.out.println(E1.EmpId);
		System.out.println(E1.Name);
		System.out.println(E1.mobile);
		System.out.println(E1.Email);

		System.out.println("............Object3 Info..............");

		Employee E2 = new Employee();
		E2.EmpId = 3;
		E2.Name = "sai";
		E2.mobile = 496442;
		E2.Email = "sai@gmail.com";
		System.out.println(E2.EmpId);
		System.out.println(E2.Name);
		System.out.println(E2.mobile);
		System.out.println(E2.Email);

		DepartmentName = "PFS";
		Location = "KPHB";

		System.out.println("............Object4 Info..............");
		System.out.println("Department is :" + DepartmentName);
		System.out.println("Location is : " + Location);

		Employee E3 = new Employee();
		E3.EmpId = 4;
		E3.Name = "Manju";
		E3.mobile = 49498380;
		E3.Email = "manju@gmail.com";
		System.out.println(E3.EmpId);
		System.out.println(E3.Name);
		System.out.println(E3.mobile);
		System.out.println(E3.Email);

		System.out.println("............Object5 Info..............");
		Employee E4 = new Employee();
		E4.EmpId = 5;
		E4.Name = "Siri";
		E4.mobile = 464711;
		E4.Email = "siri@gmail.com";
		System.out.println(E4.EmpId);
		System.out.println(E4.Name);
		System.out.println(E4.mobile);
		System.out.println(E4.Email);

	}

}
