package com.employeeapp;

public class Manager extends Employee{

	String department;

	public Manager(String empName, double salary, int empId, String department) {
		super(empName, salary, empId);
		this.department = department;
	}

	@Override
	double calcBonus(double amount) {
		System.out.println("Bonus calculation for manager");
		return amount*5;
	}
	//own method
	String[] showProjects() {
		return new String[] {"H&M","Honda","Dominos"};
	}
	
}
