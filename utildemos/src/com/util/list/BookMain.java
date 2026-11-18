package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		//create list of books
//		List<Book> books = new ArrayList<>();
//		books.add(new Book("Java",1,"Kathy","ABC Publisher",890));
//		books.add(new Book("Spring Essentials",2,"Rod","Pen Publisher",1890));
//		books.add(new Book("Secret",3,"Rhonie","Seven Publisher",990));
//		books.add(new Book("JSP and Servlets",4,"Kathy","Pen Publisher",1090));
//		books.add(new Book("Seven Habits",5,"Stephen","ABC Publisher",790));
		

		List<Book> books = Arrays.asList(
				new Book("Java",1,"Kathy","ABC Publisher",890),
				new Book("Spring Essentials",2,"Rod","Pen Publisher",1890),
				new Book("Secret",3,"Rhonie","Seven Publisher",990),
				new Book("JSP and Servlets",4,"Kathy","Pen Publisher",1090),
				new Book("Seven Habits",5,"Stephen","ABC Publisher",790)				
				);
		
		System.out.println(books);
		//iterate and print 
		for(Book book :books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("Sort and Print");
		//call the method of Collections
		Collections.sort(books);
		
		//iterate and print 
		for(Book book :books) {
			System.out.println(book);
		}
		
		
		
		
		// get books by author - Kathy
		//create a temp list - booksByAuthor
		List<Book> booksByAuthor = new ArrayList<>();
		for(Book book :books) {
			//check if the author with name Kathy exists
			if(book.getAuthor().equals("Kathy")) {
			// if yes add to the list else continue
				booksByAuthor.add(book);
			}
		}
		System.out.println();
		//iterate the other list and print it
		for (Book book : booksByAuthor) {
			System.out.println(book);
		}
		
		
		
		
		
	}
}
