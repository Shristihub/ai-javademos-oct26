package com.training.arrays;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		String[] names = new String[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.println("Add name");
			names[i] = sc.nextLine();
		}
		System.out.println("Enter username to register");
		// priya, raj, ram, jo
		String username = sc.nextLine(); // RAM
		boolean exists = false;
		for (String name : names) {
			if (name.equalsIgnoreCase(username)) {
				System.out.println("username already exists");
				exists = true;
			}
		}
		// check the value of boolean
		if (!exists)
			System.out.println("Welcome " + username);
		sc.close();
	}
}
