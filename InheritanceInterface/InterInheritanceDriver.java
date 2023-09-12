package com.tnsif.dayseven.InheritanceInterface;

public class InterInheritanceDriver {

	public static void main(String[] args) {
		Phone ph=PhoneFactor.createPhone("Samsung");
		ph.call();
		ph.sms();
		
		ph=PhoneFactor.createPhone("Jio");
		ph.call();
		ph.sms();
	}
}
  