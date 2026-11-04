package com.bankingapp;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw in Savings account");
		balance-=amount;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in Savings account");
		balance+=amount;
		super.deposit(amount);
	}

	

}
