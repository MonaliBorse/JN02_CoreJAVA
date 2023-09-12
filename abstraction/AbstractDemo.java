package com.tnsif.dayseven.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		//we can't created abstract obj.
		Shape sh; 
		//new Shape();
		Circle c1=new Circle();
		
		sh= new Square(21.4f);
		sh.calArea();
		sh.show();
		
		sh=new Circle(23);
		sh.calArea();
		sh.show();
	}

}
