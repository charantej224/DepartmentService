package com.charan.department.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charan.department.models.Department;
import com.charan.department.reference.ReferenceDataManager;

@RestController
public class DepartmentDetailsController {
	
	@Autowired
	ReferenceDataManager referenceDataManager;
	
	Logger logger = Logger.getLogger(DepartmentDetailsController.class);
	
	@GetMapping("getAllDepartments")
	public List<Department> getDepartments(){
		return referenceDataManager.getDepartmentList();
		
	}

}
