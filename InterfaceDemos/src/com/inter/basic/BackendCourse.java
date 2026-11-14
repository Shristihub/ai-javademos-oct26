package com.inter.basic;

public class BackendCourse implements ICourse {
 
	@Override
	public void showCourses() {
		System.out.println("Java Backend Developer");
		System.out.println("Python Backend Developer");
	}

	@Override
	public void courseDetails() {
		System.out.println("Spring, microservices, Java");
	}

	// default methods can be overridden
	@Override
	public void jobSupport() {
		System.out.println("job support provided for few companies");
	}

	
}
