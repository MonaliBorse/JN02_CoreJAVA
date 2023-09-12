package com.tnsif.dayseven.abstraction;

public abstract class Shape {
protected float area;
protected String shapeName;
protected static final float pi=3.14f;
//concrete or normal method
public void show()
{
	
	System.out.println("Area of "+shapeName+" is "+area);
}
abstract void calArea();


}
