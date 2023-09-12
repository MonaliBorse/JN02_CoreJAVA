package com.tnsif.multilevelinheritance;

public class Manager extends Employee {
private int teamSize;
private String taskAllocation;
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int teamSize, String taskAllocation) {
		super();
		this.teamSize = teamSize;
		this.taskAllocation = taskAllocation;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getTaskAllocation() {
		return taskAllocation;
	}

	public void setTaskAllocation(String taskAllocation) {
		this.taskAllocation = taskAllocation;
	}

}
