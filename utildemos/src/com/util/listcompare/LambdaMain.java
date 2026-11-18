package com.util.listcompare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
		List<Employee> employees =  Arrays.asList(
				new Employee("Priya",1,18000,"Bangalore"),
				new Employee("Sharath",2,12000,"Goa"),
				new Employee("Monu",3,30000,"Hassan"),
				new Employee("Raja",4,15000,"Pune"),
				new Employee("Kathy",5,48000,"Bangalore")
				);
		
		System.out.println("Sorting by name");
		// imolement comparator using Lambda expressions
//		Comparator<Employee> comp = (o1, o2)->{
//			return o2.getEmpName().compareTo(o1.getEmpName());
//		};
		
		Comparator<Employee> comp1 = (o1,o2)->o2.getEmpName().compareTo(o1.getEmpName());
		Collections.sort(employees, comp1);
			
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("Sorting by salary");
		Collections.sort(employees,(o1,o2)->Double.compare(o1.getSalary(), o2.getSalary()));
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
