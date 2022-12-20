package com.acc.lkm.dao;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	Integer addEmployee(EmployeeBean employee) throws Exception;
	EmployeeBean getEmployeeDetails(int employeeId, int deptId);
	
}
