package com.tnsif.dayseven.interfaces;

public class Employee extends Person{
	public long salary;
	public int empId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, long contactNo,int empId,long salary) {
		super(name, contactNo);
		this.empId=empId;
		this.salary=salary;	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getTax() {return salary*0.50f;}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", empId=" + empId + ",Gross salary="+ salary+",Tax= "+getTax()+", Net Salary="+(salary-getTax())+"]";
	}
	
	

}
