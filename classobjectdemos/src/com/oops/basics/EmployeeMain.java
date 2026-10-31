package com.oops.basics;

public class EmployeeMain {

	public static void main(String[] args) {
		int x =10; int y=20; //local variables
		
		// create an employee object
		Employee employee = new Employee("Priya",10,1000);
		employee.printDetails();
//
//		// create another employee object amd print it
		Employee employee1 = new Employee("Tom",20,2000);
		employee1.printDetails();
	}
}
