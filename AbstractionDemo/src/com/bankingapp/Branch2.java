package com.bankingapp;

public abstract class Branch2 extends Bank{

	@Override
	void vehicleLoan() {
		System.out.println("Vehicle Loan in branch2");
	}

	@Override
	void eduLoan() {
		System.out.println("Edu Loan in branch2");		
	}

	//own method
	void loanTypes() {
		System.out.println("short and long term loans");
	}
	
	
}
