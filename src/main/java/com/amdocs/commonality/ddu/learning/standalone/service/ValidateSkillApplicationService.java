package com.amdocs.commonality.ddu.learning.standalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillSet;

@Service
public class ValidateSkillApplicationService {
	
	@Autowired
	EmployeeMissingSkillSet employeeMissingSkillSet;
	
	public EmployeeMissingSkillSet validateSkills(EmployeeSkillSet employeeSkillSet) {
		
		employeeMissingSkillSet.setEmpId(employeeSkillSet.getEmpId());
		
		employeeSkillSet.getRequiredSkills().removeIf(skill -> employeeSkillSet.getActualSkills().stream()
				.anyMatch(skill2 -> skill2.equalsIgnoreCase(skill)));
		
		employeeMissingSkillSet.setMissingSkills(employeeSkillSet.getRequiredSkills());
		
		return employeeMissingSkillSet;
		
	}

}
