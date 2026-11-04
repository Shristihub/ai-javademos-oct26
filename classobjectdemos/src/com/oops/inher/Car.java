package com.oops.inher;

public class Car extends Vehicle{
	String accessories;
	public Car(String brand, String name, String accessories) {
		super(brand, name);
		this.accessories = accessories;
	}


	void show() {
		System.out.println(accessories);
	}

}
