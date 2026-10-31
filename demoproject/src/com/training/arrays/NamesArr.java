package com.training.arrays;

public class NamesArr {

	public static void main(String[] args) {
		String [] arr = {"java","css","HTML","Angular"};
		
		//legacy for loop - populating
		for(int i = 0;i<4;i=i+2) {
			System.out.println(arr[i]); // get the arr using index
		}
		
		System.out.println();
		//for each
		for(String val:arr) {
			System.out.println(val);
		}
		
		
	}
}

// greater number in an array