package com.lavanya;

public class Methodcalling {
	 static void method1() {
		System.out.println("method1 called");
		Methodcalling m1 = new Methodcalling();
		m1.method2();
	}

	 void method2() {
		System.out.println("method2 called");
		method3();
	}

	static void method3() {
		System.out.println("method3 called");
		Methodcalling m2 = new Methodcalling();
		m2.method4();
		
	}

	void method4() {
		System.out.println("method4 called");
		method5();
	}

	static void method5() {
		System.out.println("method5 called");
		Methodcalling m3 = new Methodcalling();
		m3.method6();
	}
	void method6() {
		System.out.println("method6 called");
		method7();
	}
	static void method7() {
		System.out.println("method7 called");
		Methodcalling m4 = new Methodcalling();
		m4.method8();
	}
		
	
	void method8() {
		System.out.println("method8 called");
		method9();
	}
	static void method9() {
		System.out.println("method9 called");
		Methodcalling m5 = new Methodcalling();
		
		 m5.method10();
	}
	void method10() {
		System.out.println("method10 called");
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		method1();
		System.out.println("main method ended");
	}

}
