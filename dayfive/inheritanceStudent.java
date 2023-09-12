package com.tnsif.dayfive;

public class inheritanceStudent {
private String UID;
private String Name;
private String Stream;
private String batchCode ;
private static String collegeName;
private static String ssTrainer;
private static String tsTrainer;
private long contactNo;
public String getUID() {
	return UID;
}
public inheritanceStudent(String uID, String name, String stream,String batchCode,long constactNo) {
	super();
	UID = uID;
	Name = name;
	Stream = stream;
	this.batchCode=batchCode;
	this.contactNo=constactNo;
}
public inheritanceStudent() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "inheritanceStudent [UID=" + UID + ", Name=" + Name + ", Stream=" + Stream + ", batchCode=" + batchCode
			+ ", contactNo=" + contactNo + "]";
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
public String getStream() {
	return Stream;
}
public void setStream(String stream) {
	Stream = stream;
}
public static String getCollegeName() {
	return collegeName;
}
public static void setCollegeName(String collegeName) {
	inheritanceStudent.collegeName = collegeName;
}

public String getBatchCode() {
	return batchCode;
}
public void setBatchCode(String batchCode) {
	this.batchCode = batchCode;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public String getSsTrainer() {
	return ssTrainer;
}
public void setSsTrainer(String ssTrainer) {
	this.ssTrainer = ssTrainer;
}
public String getTsTrainer() {
	return tsTrainer;
}
public void setTsTrainer(String tsTrainer) {
	this.tsTrainer = tsTrainer;
}


}
