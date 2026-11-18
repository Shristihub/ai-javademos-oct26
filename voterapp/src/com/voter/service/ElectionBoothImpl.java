package com.voter.service;

import com.voter.exceptions.InvalidVoterIdException;
import com.voter.exceptions.LocalityNotFoundException;
import com.voter.exceptions.NotEligibleException;
import com.voter.exceptions.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{

	@Override
	public boolean checkEligiblity(int age, String locality, int voterId) throws 
	                 NotEligibleException{
		
		if(checkAge(age)&& checkLocality(locality)&& checkVoterId(voterId)) {
			return true;
		}
		return false;
	}
	
	private boolean checkAge(int age) throws UnderAgeException{
//		if age is <18 throw exception else return true
		if(age<18) {
			throw new UnderAgeException("Your age is under 18. not valid to vote");
		}
		return true;
	}
	
	private boolean checkLocality(String locality) throws LocalityNotFoundException{
		//check the locality in the array of localities
		String[] localities = {"Whitefield","Hoodi","Aecs Layout"};
		// use for each iterate thru the array - use  a flag
		boolean localityFound=false;
		for (String nlocality : localities) {
			if(nlocality.equals(locality)) {
//				 if locality is found flip the flag
				localityFound = true;
				break;
			}
		}
		if(!localityFound) {
			throw new LocalityNotFoundException("Your locality is not under this ward");
		}
		return true;
		
	}
	private boolean checkVoterId(int voterId) throws InvalidVoterIdException{
		// check if voter id is between 1000-10000
		if(voterId>1000 && voterId<10000) {
			return true;
		}
		throw new InvalidVoterIdException("voter id is invalid");
	}
	
	
	
	
	
	

}
