package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {

	// simulate a database
	// make it static to be called using class name
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java",1,"Kathy",890,"tech",LocalDate.of(1998, 10, 20)),
				new Book("Angular",2,"Joe Ben",760,"tech",LocalDate.of(2010, 1, 2)),
				new Book("Placebo",3,"Joe",1230,"spiritual",LocalDate.of(1977, 10, 21)),
				new Book("Master Mind",4,"Ann Joe",1890,"selfhelp",LocalDate.of(2003, 1, 2)),
				new Book("Master Yoga ",5,"BKS",790,"selfhelp",LocalDate.of(1980, 2, 15)),
				new Book("Spring",6,"Rod Joe",590,"tech",LocalDate.of(2000, 10, 20))	
				);
	}
	
}
