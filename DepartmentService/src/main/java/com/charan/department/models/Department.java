package com.charan.department.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
	
	@JsonProperty("DepartmentName")
	String departmentName;
	
	@JsonProperty("DepartmentId")
	int departmentId;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	

}
