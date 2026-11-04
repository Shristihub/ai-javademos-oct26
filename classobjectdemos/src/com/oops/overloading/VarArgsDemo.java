package com.oops.overloading;

public class VarArgsDemo {

	void calcSum(String name, int...marks) {
		System.out.println("Welcome "+name);
		int sum = 0;
		for (int mark : marks) {
			sum+=mark;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		VarArgsDemo ref = new VarArgsDemo();
		ref.calcSum("Priya"); //array size is 0
		ref.calcSum("Priya",90,80,96); //array size is 3
		ref.calcSum("Sri", 100,98,98);
	
	}
	
}
