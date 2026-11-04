package com.oops.overloading;

public class Shape {

	void area(int x) {
		System.out.println("Sq "+(x*x));
	}
	int area(int x, int y) {
		return x*y;
	}
//	double area(int x, double y) {
//		return 0.5*x*y;
//	}
	void area(double x) {
		System.out.println("Cir "+(Math.PI*x*x));
	}
}
