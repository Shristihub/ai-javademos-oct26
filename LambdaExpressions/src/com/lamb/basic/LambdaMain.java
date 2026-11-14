package com.lamb.basic;

public class LambdaMain {
	public static void main(String[] args) {
	
	 //implementaion
     IGreet ref =  ()->{
    	 System.out.println("Have a great day");
     };
	 //call the method
     ref.greetMessage();
     
	IGreet ref1 = ()->System.out.println("Have a great weekend");
	//calling
	ref1.greetMessage();
	
	ICourse frontend = ()->{
		return new String[] {"React","Html","Css"};
	};
	String[] frontcourses =  frontend.showCourses();
	for (String course : frontcourses) 
		System.out.println(course);
	
	
	ICourse backend = ()-> new String[] {"Java","Spring","Micro"};
	
	
	
	
	
	
	}
}
