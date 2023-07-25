package com.tnsif.daytwo;

public class Stud {
private String UID,Name,branch;
private long contactNo;
private static String collegeName,SsTrainer,TtTrainer;
static
{
	System.out.print("Static Bolck is......");
	collegeName="PVG";
	SsTrainer="Divya Mam";
	TtTrainer="Aalpana Mam";
}
public Stud(String uID, String name, String branch, long contactNo) {
	super();
	UID = uID;
	Name = name;
	this.branch = branch;
	this.contactNo = contactNo;
}
public Stud() {
	super();
	// TODO Auto-generated constructor stub
}
public String getUID() {
	return UID;
}
public void setUID(String uID) {
	UID = uID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public static String getCollegeName() {
	return collegeName;
}
public static void setCollegeName(String collegeName) {
	Stud.collegeName = collegeName;
}
public static String getSsTrainer() {
	return SsTrainer;
}
public static void setSsTrainer(String ssTrainer) {
	Stud.SsTrainer = ssTrainer;
}
public static String getTtTrainer() {
	return TtTrainer;
}
public static void setTtTrainer(String ttTrainer) {
	Stud.TtTrainer = ttTrainer;
}
void change() {
	UID="10";
	
}
@Override
public String toString() {
	return "Stud [UID=" + UID + ", Name=" + Name + ", branch=" + branch + ", contactNo=" + contactNo + ", College Name" + collegeName +"]";
}


}
