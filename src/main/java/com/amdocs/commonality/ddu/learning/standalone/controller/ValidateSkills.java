package com.amdocs.commonality.ddu.learning.standalone.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.service.ValidateSkillApplicationService;

@RestController
@RequestMapping("/employeemanagement/v1")
public class ValidateSkills {
	
	@Autowired
	ValidateSkillApplicationService validateSkillApplicationService;
	
	@PostMapping("/validateEmployeeSkills")
	public ResponseEntity<EmployeeMissingSkillSet> validateSkills(@RequestBody EmployeeSkillSet employeeSkillSet) {
		
		EmployeeMissingSkillSet employeeMissingSkillSet = validateSkillApplicationService.validateSkills(employeeSkillSet);
		
		return new ResponseEntity<EmployeeMissingSkillSet>(employeeMissingSkillSet,HttpStatus.CREATED);
		
	}
	

}

