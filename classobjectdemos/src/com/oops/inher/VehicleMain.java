package com.oops.inher;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("A101","Audi");
		vehicle.printDetails();
		
		Car car = new Car("X100","Honda","Music System");
		car.printDetails();
		car.show();
	}

}
