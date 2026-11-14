package com.inter.basic;

public interface ICourse {

	void showCourses();
	void courseDetails();
	
	//common for all implementation classes
	//can be called ONLY using interface name
	static void interviewSupport() {
		System.out.println("provides interview support");
	}
	
	 //use default keyword
	//can be overridden
	 default void  jobSupport() {
		System.out.println("check on job support");
	}
	
}
