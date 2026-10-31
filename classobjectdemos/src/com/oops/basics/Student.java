package com.oops.basics;

public class Student {

	String studName;
	int studId;
	String department;
	
	//parameterized construc
	public Student(String studName, int studId, String department) {
		super();
		this.studName = studName;
		this.studId = studId;
		this.department = department;
	}
	
	void printDetails(){
		System.out.println("Name "+studName);
		System.out.println("Id "+studId);
		System.out.println("Department "+department);
	}
	/* multiline */
	String greetMessage(){
//		String result = "Welcome "+studName;
//		return result;
        return "Welcome "+studName;
		
		
	}
	  String [] showCourses(){
		  //return an array of strings;
//        String[] courses = {"Java","Spring", "React"};
//        return courses;
//        
          return new String[]{"Java","Spring", "React"};
        
	  }
	
	
	
}









