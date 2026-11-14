package com.bankingapp;

public abstract class Bank {

	abstract void carLoan();
	abstract void vehicleLoan();
	abstract void eduLoan();
	
	//concrete methods
	void adminDetails() {
		System.out.println("Admin ");
	}
}
