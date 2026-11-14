package com.inter.basic;

public class InterClient {

	public static void main(String[] args) {
		ICourse courseref = new BackendCourse();
		courseref.courseDetails();
		courseref.showCourses();
		
		courseref = new MeanCourse();
		courseref.courseDetails();
		courseref.showCourses();
		
		ICourse.interviewSupport();
	}
}
