package com.tnsif.multilevelinheritance;

public class Employee extends Person {
	private String empId;
	private int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String empId, int salary) {
		super();
		this.empId = empId;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

}
