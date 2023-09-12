package com.tnsif.multilevelinheritance;

public class Person {
private String name;
private long constacNo;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(String name, long constacNo) {
	super();
	this.name = name;
	this.constacNo = constacNo;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getConstacNo() {
	return constacNo;
}
public void setConstacNo(long constacNo) {
	this.constacNo = constacNo;
}
@Override
public String toString() {
	return "Person [name=" + name + ", constacNo=" + constacNo + "]";
}


}
