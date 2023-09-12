package com.tnsif.dayseven.interfaces;

public class Person {
String name;
long contactNo;


public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, long contactNo) {
	super();
	this.name = name;
	this.contactNo = contactNo;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
@Override
public String toString() {
	return "Person [name=" + name + ", contactNo=" + contactNo + "]";
}

}
