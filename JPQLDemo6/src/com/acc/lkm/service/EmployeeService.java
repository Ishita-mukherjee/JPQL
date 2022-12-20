package com.acc.lkm.service;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	Integer addEmployee(EmployeeBean employee) throws Exception;
	EmployeeBean getEmployeeDetails(int employeeId, int deptId);

}
