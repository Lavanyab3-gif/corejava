package com.oops;

public class Library {
	private int bookId;
	private String bookName;
	private String author;

	public void setBookId(int bookId) {
		if(bookId > 0) {
		this.bookId = bookId;
		}
		else {
			System.out.println("Invalid BookId");
		}
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

}
