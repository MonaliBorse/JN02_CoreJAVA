package com.tnsif.dayseven.abstraction;

public class Square extends Shape {
float side;
	public Square() {
		// TODO Auto-generated constructor stub
		shapeName="Square";
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float side) {
		super();
		shapeName="Square";
		this.side = side;
	}
	
	@Override
	void calArea() {
		area=side*side;
	}


}
