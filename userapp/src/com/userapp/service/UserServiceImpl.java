package com.userapp.service;

import com.userapp.exceptions.NameExistsException;
import com.userapp.exceptions.TooLongException;
import com.userapp.exceptions.TooShortException;

public class UserServiceImpl implements IUserService {

	//create a String array with names 
	String [] usernames = {"Priya","Rakesh","Raju","Anna"};
	@Override
	public boolean checkUsername(String username) throws NameExistsException {
		//iterate the array using for each
		// check if name exists - if yes throw exception
		//else return true
		return true;
	}

	@Override
	public boolean createPassword(String password) throws TooShortException, TooLongException {
		// if password is less than 5 throw TooShortException
		// if password is greater than 15 throw TooLongException
		// if password does not have number, special chars, uppercase, lowercase throw PatternNotMatchingException
		
		return true;
	}

}
