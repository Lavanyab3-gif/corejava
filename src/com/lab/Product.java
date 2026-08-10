package com.lab;

public class Product {
	int productId;
	static String productName;
	int productPrice;
	String companyName;
	 {
		System.out.println("Food pvt.Ltd");
	}
	void display() {
		System.out.println(productName);
		System.out.println(productId);
		System.out.println(productPrice);
		
	}


	public static void main(String[] args) {
		productName = "Biryani";
		Product p = new Product();
		p.productId = 1;
		p.productPrice = 150;
		p.display();
		
		Product p1 = new Product();
		p1.productName = "Chiken65";
		p1.productId = 2;
		p1.productPrice = 250;
		
		p1.display();
		
		
	

	}

}
