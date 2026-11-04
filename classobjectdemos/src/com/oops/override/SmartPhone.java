package com.oops.override;

public class SmartPhone extends Mobile {

	@Override
	public void callUser() {
		System.out.println("calling thru phone or whatsapp");
	}

	// own method
	String[] availableApps() {
		return new String[] {"insta","chrome","facebook"};
	}
}
