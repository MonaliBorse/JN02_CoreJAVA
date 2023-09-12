package com.tnsif.dayseven.InheritanceInterface;

public class Jio implements Phone{
	
	@Override
	public void call() {
		System.out.println("Calling to Jio");
	}

	@Override
	public void sms() {
		System.out.println("Message to Jio");		
	}
}
