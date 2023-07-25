package com.tnsif.daytwo;

public class DriverStude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------In Main");
		System.out.println(Stud.getCollegeName());
		System.out.println(Stud.getSsTrainer());
		System.out.println(Stud.getTtTrainer());
		Stud s1,s2,s3;
		s1=new Stud("TC1230","Adi","CSE",121242434);
		s2=new Stud("TC1231","Aditya","CSE",12142434);
		s3=new Stud("TC1232","Mahi","SE",1214);
		Stud.setCollegeName("PVG,Nashik");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
