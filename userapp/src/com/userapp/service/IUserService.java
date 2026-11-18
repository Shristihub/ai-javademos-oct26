package com.userapp.service;

import com.userapp.exceptions.NameExistsException;
import com.userapp.exceptions.TooLongException;
import com.userapp.exceptions.TooShortException;

public interface IUserService {

	boolean checkUsername(String username)throws NameExistsException;
	boolean createPassword(String password) throws TooShortException,TooLongException;
}
   