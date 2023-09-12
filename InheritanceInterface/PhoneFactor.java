package com.tnsif.dayseven.InheritanceInterface;

public class PhoneFactor {

	public static Phone createPhone(String company)
	{
		if(company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if(company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
		
		
	}
	public PhoneFactor() {
		// TODO Auto-generated constructor stub
	}

}
