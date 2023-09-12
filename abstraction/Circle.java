package com.tnsif.dayseven.abstraction;

public class Circle extends Shape {
private float radius;

	public Circle() {
		shapeName="Circle";
	// TODO Auto-generated constructor stub
}

	public Circle(float radius) {
	super();
	shapeName="Circle";
	this.radius = radius;
}

	public float getRadius() {
	return radius;
}

public void setRadius(float radius) {
	this.radius = radius;
}

	@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}

	@Override
	void calArea() {
		area=Shape.pi*radius*radius;
	}

}
