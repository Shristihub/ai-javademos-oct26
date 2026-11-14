package com.bankingapp;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("Car Loan in subbranch");
	}

	//own method
	void investmentTypes() {
		System.out.println("MutualFunds and many more");
	}
}
