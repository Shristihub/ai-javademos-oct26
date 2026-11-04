package com.employeeapp;

public class EmpDashboard {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee employee = new Manager("Tom",20000,1,"It");
		employee.printDetails();
		System.out.println(employee.calcBonus(5000));
		
		//own method
		Manager manager = (Manager)employee;
		String[] projects =  manager.showProjects();
		for (String project : projects) {
			System.out.println(project);
		}
		
		employee = new Developer("Jack", 10000, 10, "Honda");
		employee.printDetails();
		System.out.println(employee.calcBonus(5000));
		
		Developer developer = (Developer)employee;
		developer.coursesTaken("Java","Spring","Maven");
		
		
		
		
		
	}
}
