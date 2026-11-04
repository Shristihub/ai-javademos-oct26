package com.bankingapp;

public class Account {

	protected double balance;
	//static variable
	public static String bankName = "ABC Bank";
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) {
		System.out.println("Withdraw in account class");
	}
	void deposit(double amount) {
		System.out.println("Deposit in account class");
	}
	double getBalance() {
		return this.balance;
	}
	
}
