package com.amdocs.commonality.ddu.learning.standalone.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMissingSkillSet {
	
	String empId;
	List<String> missingSkills = new ArrayList<String>();
	
	@Override
	public String toString() {
		return "EmployeeMissingSkillSet [empId=" + empId + ", missingSkills=" + missingSkills + "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<String> getMissingSkills() {
		return missingSkills;
	}

	public void setMissingSkills(List<String> missingSkills) {
		this.missingSkills = missingSkills;
	}
	
	

}