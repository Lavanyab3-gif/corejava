package com.practice;

public class Mfc {
	String customerName;
	String item;
	int price;
	String mobileNo;
	static int tokenNo = 0;
	int token;

	 {
		token = tokenNo;
		tokenNo++;
	}

	void display() {

		System.out.println(customerName);
		System.out.println(item);
		System.out.println(price);
		System.out.println(mobileNo);
		System.out.println("tokenNo : " + tokenNo);
		System.out.println("**********************");
	}

	public static void main(String[] ags) {
		Mfc m = new Mfc();

		m.customerName = "Lavanya";
		m.item = "Biryani";
		m.price = 150;
		m.mobileNo = "9618688201";
		m.display();
		Mfc m1 = new Mfc();
		m1.customerName = "Durga";
		m1.item = "Chiken65";
		m1.price = 250;
		m1.mobileNo = "7993248336";
		
		m1.display();

	}

}
