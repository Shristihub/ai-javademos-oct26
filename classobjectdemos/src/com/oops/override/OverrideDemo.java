package com.oops.override;

public class OverrideDemo {
	public static void main(String[] args) {
		//super class ref = sub class object
		Mobile mobile =  new BasicPhone();
		mobile.callUser(); //call the common methods
		
		mobile = new SmartPhone();
		mobile.callUser();
		
		//downcast mobile ref to Smartphone
		SmartPhone smart =  (SmartPhone)mobile;
		//call the own methods of smartphone
		String[] apps =  smart.availableApps();
		for (String app : apps) {
			System.out.println(app);
		}
	}

}
