package com.userapp.client;

import com.userapp.service.IUserService;
import com.userapp.service.UserServiceImpl;

public class Register {
	
	public static void main(String[] args) {
		IUserService userService =new UserServiceImpl();
		//call the methods
		// check if the name exists
		// if true call createpassword 
		// else   tthrow exception
//		userService.checkUsername("Sri");
	}

}
