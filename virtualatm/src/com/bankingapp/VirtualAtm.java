package com.bankingapp;

public class VirtualAtm {

	public static void main(String[] args) {
		//print the static variable using classname
		System.out.println(Account.bankName); //classname.variable nme
		//create a ref of account  = savings or current
		Account account = new Savings(20000);
		account.withdraw(1000);
		double balance =  account.getBalance();
		System.out.println("Balance in savings account"+balance);
		
		account = new Current(10000);
		account.deposit(1000);
		System.out.println("Balance in currecnt account  "+account.getBalance());
		
		//call the own method of current
		long x =100;
		int y = (int)x; //downcasting
		
		//downcast the super class ref
		Current current = (Current)account; //downcasting of objects
		current.showLoanTypes();
		
		
		
	}
}
