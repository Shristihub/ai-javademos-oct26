package com.voter.service;

import com.voter.exceptions.NotEligibleException;

public interface IElectionBooth {
	
	  boolean checkEligiblity(int age, String locality, int voterId)throws NotEligibleException;

}
