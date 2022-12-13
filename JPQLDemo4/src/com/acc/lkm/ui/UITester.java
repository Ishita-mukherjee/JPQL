package com.acc.lkm.ui;

import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			 getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	public static void getAllEmployeesWithAssetDetails() {

		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			 employeeService.getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
