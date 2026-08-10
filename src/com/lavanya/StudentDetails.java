package com.lavanya;

public class StudentDetails {
//static variables
	static String Collegename;
	static String Location;
//Instance variables
	int Rollno;
	String Name;
	long Mobile;
	String Branch;
	String Email;

	public static void main(String[] args) {
		Collegename = "Avanthi College";
		Location = "Vizianagram";
		
		System.out.println("---------Student Details-------");
		System.out.println(Collegename);
		System.out.println(Location);
		
		StudentDetails S1 = new StudentDetails();
		
	
		S1.Rollno = 056;
		S1.Name  = "Lavanya";
		S1.Mobile = 688201;
		S1.Branch = "CSE";
		S1.Email = "nululavanya";
	
		System.out.println(S1.Name);
        System.out.println(S1.Mobile);
        System.out.println(S1.Branch);
        System.out.println(S1.Email);
	

}
}
