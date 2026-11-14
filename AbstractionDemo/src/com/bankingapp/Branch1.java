package com.bankingapp;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Car Loan in branch1");
	}

	@Override
	void vehicleLoan() {
		System.out.println("Vehicle Loan in branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("education Loan in branch1");
	}
	
	void depositDetails() {
		System.out.println("Deposit schemes in Branch1");
	}

}
