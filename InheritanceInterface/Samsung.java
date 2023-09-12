package com.tnsif.dayseven.InheritanceInterface;

public class Samsung implements Phone {

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println("Calling to Samsung");
		
	}

	@Override
	public void sms() {
		System.out.println("Message to Samsung");		
		
	}

}
