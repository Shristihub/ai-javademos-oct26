package com.employeeapp;

public class Developer extends Employee {

	String projectName;
	
	public Developer(String empName, double salary, int empId, String projectName) {
		super(empName, salary, empId);
		this.projectName = projectName;
	}

	@Override
	double calcBonus(double amount) {
		System.out.println("Bonus calculation for Developer");
		return amount*2;
	}
	//own method
	void coursesTaken(String...courses) {
		System.out.println("The cousrses taken by the developer");
		//iterate and print
		for (String course : courses) {
			System.out.println(course);
		}
		
		
	}
	
}
