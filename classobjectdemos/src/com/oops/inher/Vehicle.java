package com.oops.inher;

public class Vehicle {

	String brand;
	String name;

	public Vehicle(String brand, String name) {
		this.brand = brand;
		this.name = name;
	}

	void printDetails() {
		System.out.println("Name "+name);
		System.out.println("Brand "+brand);
	}
}
