package com.lab;

public class LibraryBook {
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	String libraryName;
	String librarianName;
	void displayBookDetails() {
		System.out.println("bookId :" + bookId);
		System.out.println("bookTitle:" + bookTitle);
		System.out.println("authorName:"+authorName);
		System.out.println("availableCopies:"+availableCopies);
		
		
	} 
	void displayLibraryDetails() {
		System.out.println("libraryName:"+libraryName);
		System.out.println("librarianName:"+librarianName);
	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook();
		
		b1.bookId = 1;
		b1.bookTitle = "Java";
		b1.authorName = "James Gosling";
		b1.availableCopies = 10;
		b1.libraryName= "JRE";
		b1.librarianName = "Lavanya";
		b1. displayBookDetails();
		b1.displayLibraryDetails();
		System.out.println("*****************");
		LibraryBook b2 = new LibraryBook();
		b2.bookId = 2;
		b2.bookTitle = "SQL";
		b2.authorName = "ABC";
		b2.availableCopies = 20;
		b2.libraryName= "Javascript";
		b2.librarianName = "Sai";
		b2. displayBookDetails();
		b2.displayLibraryDetails();
		

	}

}
