package com.charan.department.reference;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.charan.department.models.Department;

@Component
public class ReferenceDataManager {

	List<Department> departmentList;

	public List<Department> getDepartmentList() {
		departmentList = new ArrayList<Department>();
		Department department1 = new Department();
		department1.setDepartmentId(10);
		department1.setDepartmentName("Consuting");
		Department department2 = new Department();
		department2.setDepartmentId(20);
		department2.setDepartmentName("Advisory");
		departmentList.add(department1);
		departmentList.add(department2);
		return departmentList;

	}

}
