package com.acc.lkm.service;

import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getAllEmployeesWithAssetDetails() throws Exception {
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeDAO.getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
