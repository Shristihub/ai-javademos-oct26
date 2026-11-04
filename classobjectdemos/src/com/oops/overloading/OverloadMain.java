package com.oops.overloading;

public class OverloadMain {
	public static void main(String[] args) {
		//create an object
		Shape shape = new Shape();
		//call the methods
		shape.area(10);
		int result = (int)shape.area(10,20);
		System.out.println("Rect "+result);
		
		double tri = shape.area(10,(int)20.5);
		System.out.println("Tri "+tri);
		shape.area(10.2);
	}

}
