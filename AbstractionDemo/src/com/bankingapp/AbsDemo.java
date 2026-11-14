package com.bankingapp;

public class AbsDemo {
	public static void main(String[] args) {
		//super class ref = sub class obj
		Bank bank =  new Branch1();
		//call all method of Bank class
		bank.vehicleLoan();
		bank.carLoan();
		bank.eduLoan();
		bank.adminDetails();
		
		//call ownmethod of Branch1
		Branch1 branch1 = (Branch1)bank;
		branch1.depositDetails();
		
		bank = new SubBranch();
		bank.vehicleLoan();
		bank.carLoan();
		bank.eduLoan();
		bank.adminDetails();
		
		//call ownmethod of Branch2
		//create a ref of SubBranch
		SubBranch sub = (SubBranch)bank;
		sub.investmentTypes();//own method of subbranch
		sub.loanTypes(); //method of super class - Branch2
		
		//method of super class - Branch2
		//create a ref of Branch2
		Branch2 ref = (Branch2)bank;
		ref.loanTypes();
		
		
		
		
		
	}
}




