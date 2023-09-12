package com.tnsif.dayseven.interfaces;

public class Secondimpl implements Second {

	@Override
	public void show() {
        System.out.println("In first show()");		
	}

	@Override
	public void diplay() {
System.out.println("display()");		
	}

	@Override
	public String greet(String name) {
		return "Good M";
	}

}
