package com.voter.service;

public interface IElectionBooth {
	
	  boolean checkEligiblity(int age, String locality, int voterId);

}
