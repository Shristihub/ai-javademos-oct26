package com.oops.basics;

public class Employee {

	//instance variables
	String empName;
	int empId;
	double salary;
	
	//paramaterised constr
	public Employee(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
    //method
	void printDetails(){
		System.out.println("Name "+empName);
		System.out.println("Salary "+salary);
		System.out.println("EmpID " +empId); 	
	}
	

	
}
