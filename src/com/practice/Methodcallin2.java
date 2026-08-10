package com.practice;

public class Methodcallin2 {
	void method1() {
		method2();
		System.out.println("method1 called");
	}
	void method2() {
		method3();
		System.out.println("method2 called");
	}
	void method3() {
		method4();
		System.out.println("method3 called");
	}
	void method4() {
		method5();
		System.out.println("method4 called");
		
	}
	void method5() {
		method6();
		System.out.println("method5 called");
		
	}
	void method6() {
		method7();
		System.out.println("method6 called");
	}
	void method7() {
		System.out.println("method7 called");
		method8();
	}
	void method8() {
		System.out.println("method8 called");
		method9();
	}
	void method9() {
		System.out.println("method9 called");
		method10();
	}
	void method10() {
		System.out.println("method10 called");
	}



	public static void main(String[] args) {
		System.out.println("Main mathod started");
		 Methodcallin2 c = new  Methodcallin2();
		
		
		 c.method1();
		 System.out.println("Main method ended");
		

	}

}
