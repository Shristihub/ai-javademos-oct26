package com.bookapp.model;

import java.time.LocalDate;

public class Book {

	private String title;
	private Integer bookId;
	private String author;
	private double price;
	private String category;
	private LocalDate datePublished;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, Integer bookId, String author, double price, String category, LocalDate datePublished) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.author = author;
		this.price = price;
		this.category = category;
		this.datePublished = datePublished;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", author=" + author + ", price=" + price + ", category="
				+ category + ", datePublished=" + datePublished + "]";
	}
	
	
	
}
