package com.tnsif.dayseven.interfaces;

public class Driver {

	public static void main(String[] args) {
		//we can't create interface of interface
		//f=new First();
		First f;
		f=new Firstimpl();
		f.show();
		f.diplay();
		
		/*Second s=new Secondimpl();
		s.show();
		s.diplay();
		System.out.println(s.greet("World!!"));
		*/
		
		//lambda expression
		//in that no need to write return keyword.if you want you can write
		/*Calculate c=(float p,float n, float r)->((p*n*r)/100);
		System.out.println("simple interest: "+c.getSimpleInterest(1200, 5, 7.31f));
		
		Employee e=new Employee("Monali",230493921,101,25000);
		System.out.println(e);*/
	}

}
