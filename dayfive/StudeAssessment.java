package com.tnsif.dayfive;

public class StudeAssessment extends inheritanceStudent {
private float ssScore;
private float tsScore;

public StudeAssessment() {
	super();
	// TODO Auto-generated constructor stub
}
public StudeAssessment(String uID, String name, String stream, String batchCode, long constactNo) {
	super(uID, name, stream, batchCode, constactNo);
	// TODO Auto-generated constructor stub
}

public StudeAssessment(String uID, String name, String stream, String batchCode, long constactNo, float ssScore,
		float tsScore) {
	super(uID, name, stream, batchCode, constactNo);
	//super.UID=uID; private members an't inherited
	this.ssScore = ssScore;
	this.tsScore = tsScore;
}
public float getSsScore() {
	return ssScore;
}

public void setSsScore(float ssScore) {
	this.ssScore = ssScore;
}

public float getTsScore() {
	return tsScore;
}

public void setTsScore(float tsScore) {
	this.tsScore = tsScore;
}
@Override
public String toString() {
	return "StudeAssessment [ssScore=" + ssScore + ", tsScore=" + tsScore + ", toString()=" + super.toString() + "]";
}


}
