package com.oops;

public class Library1 {

	public static void main(String[] args) {
		Library l1 = new Library();
		
		l1.setBookId(-123);
		l1.setBookName("Java");
		l1.setAuthor("James Gosling");

		System.out.println(l1.getBookId());
		System.out.println(l1.getBookName());
		System.out.println(l1.getAuthor());

	}

}
