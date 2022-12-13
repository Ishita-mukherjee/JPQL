package com.acc.lkm.service;

import java.util.List;

import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound,Double upperBound) throws Exception;
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange2(Double lowerBound,Double upperBound) throws Exception;
}
