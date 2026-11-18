package com.voter.client;

import com.voter.exceptions.InvalidVoterIdException;
import com.voter.exceptions.LocalityNotFoundException;
import com.voter.exceptions.NotEligibleException;
import com.voter.exceptions.UnderAgeException;
import com.voter.service.ElectionBoothImpl;
import com.voter.service.IElectionBooth;

public class Voter {

	public static void main(String[] args) {
		// interface ref = implementation class
		IElectionBooth electionBooth = new ElectionBoothImpl();
		try {
			boolean result = electionBooth.checkEligiblity(2, "Hoodi", 1001);
			if (result) {
				System.out.println("You are eleigible to vote");
			}
		} catch (UnderAgeException e) {
			System.out.println("You age is invalid");
			System.out.println(e.getMessage());
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (InvalidVoterIdException e) {
			System.out.println(e.getMessage());
		}catch (NotEligibleException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("Good bye");
	}

}
