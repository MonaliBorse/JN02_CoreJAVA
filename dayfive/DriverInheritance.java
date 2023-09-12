package com.tnsif.dayfive;

public class DriverInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudeAssessment obj=new StudeAssessment();
obj.setUID("TC");
obj.setName("Monali");
obj.setStream("Comp");
obj.setContactNo(123423525);
obj.setBatchCode("TC23423");
obj.setSsTrainer("Divya mam");
//inheritanceStudent.setSsTrainer("Divya");
obj.setTsTrainer("Alpana");
obj.setSsScore(243.4f);
obj.setTsScore(70.7f);
System.out.print(obj);

StudeAssessment obj1= new StudeAssessment("TC","Monali","Comp","TC1423",1233);
System.out.print(obj1);

	}

}
