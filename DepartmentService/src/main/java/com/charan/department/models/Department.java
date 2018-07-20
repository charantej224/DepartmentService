package com.charan.department.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {
	
	@JsonProperty("DepartmentName")
	private String departmentName;
	
	@JsonProperty("DepartmentId")
	private int departmentId;
	
	@JsonProperty("Port")
	private String port;

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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
