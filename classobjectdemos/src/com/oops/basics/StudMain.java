package com.oops.basics;

public class StudMain {

	public static void main(String[] args) {
		Student student = new Student("Jo",1,"CSE");
		student.printDetails();
		
		String result = student.greetMessage();
		System.out.println(result);
		
		String[] courses = student.showCourses();
		for(String course:courses) {
			System.out.println(course);
		}
		
		Student student1 = new Student("Helen",2,"CSE");
		student1.printDetails();
		System.out.println(student1.greetMessage());
		String[] courses1 = student1.showCourses();
		for(String course:courses1) {
			System.out.println(course);
		}
		
		
	}

}
