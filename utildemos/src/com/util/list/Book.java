package com.util.list;

public class Book implements Comparable<Book>{

	private String title;
	private Integer bookId; // primary key
	private String author;
	private String publisher;
	private double price;
	
	//default constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	//para constructor
	public Book(String title, Integer bookId, String author, String publisher, double price) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		//compare 2 string values - titles - sort by title
//		return  this.getTitle().compareTo(o.getTitle());
		
		//compare 2 double values - price - sort by price
		return Double.compare(this.getPrice(), o.getPrice());
		
		
		
	}
	
	

      


}
