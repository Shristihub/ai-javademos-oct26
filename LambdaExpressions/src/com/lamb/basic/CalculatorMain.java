package com.lamb.basic;

public class CalculatorMain {
	public static void main(String[] args) {
		
		ICalculator add = (x,y)->System.out.println("Sum "+(x+y));
		add.calculate(10, 20);
		
		
		IShape sq = (x,y)->{
			System.out.println("Area of sqaure");
			return x*x;
		};
		System.out.println("This will be printed first...");
		double area = sq.area(10, 20);
		System.out.println(area);
		
				
		IShape rect = (x,y)-> x*y;
		
		System.out.println("Rect "+rect.area(1, 20));
	}

}
