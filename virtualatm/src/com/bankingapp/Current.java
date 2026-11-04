package com.bankingapp;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw in Current account");
		balance=balance-amount-100;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit in Current account");
		balance=balance+ amount+100;
		super.deposit(amount);
	}

	//own method
	void showLoanTypes() {
		System.out.println("Short-term and long-term loans available");
	}
	
}
