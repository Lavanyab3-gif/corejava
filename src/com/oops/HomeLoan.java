package com.oops;

public class HomeLoan extends Loan {
	
	void homeLoanDocInfo() {
		System.out.println("Home Loan Doc Info received Succussfully");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to HomeLoan Process..");
	

	HomeLoan hl = new HomeLoan();
	
	if(hl.getSalary() >= 60000.00 && hl.getCibilScore() > 300 && hl.getCibilScore() <= 900) {
		System.out.println("Good to know Let's Start the remaining process..");

		if (hl.checkAadhar() && hl.checkPan() && hl.checkPhoneNum()) {
			System.out.println("Congratulations!! Your  Personal Loan Got Approved!!");
			System.out.println("Personal Loan ROI is:" + hl.getROI());
			hl.homeLoanDocInfo();

		} else {
			System.out.println("Somrthing went with ur data can you check once..");
		}
	}else {
		System.out.println("Your loan got rejected");
	}
}
		

}

