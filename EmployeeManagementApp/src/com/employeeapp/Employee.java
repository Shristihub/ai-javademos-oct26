package com.employeeapp;

public class Employee {

	String empName;
	double salary;
	int empId;
	//static variable
	public static String companyName="ABC Limited";
	
	//para constr
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}
	void printDetails() {
		System.out.println(empName+" "+empId+" "+salary);
	}
	double calcBonus(double amount) {
		System.out.println("Bonus Calculation");
		return 0.0;
	}
	
	
			
}
