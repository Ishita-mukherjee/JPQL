package com.acc.lkm.ui;

import java.util.List;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			//retrieveEmployeeDetailsWithInSalaryRange1(30000.0,70000.0);
			
			
			retrieveEmployeeDetailsWithInSalaryRange1(30000.0,70000.0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound, Double upperBound) {
		List<EmployeeBean> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeDetailsWithInSalaryRange1(lowerBound,upperBound);
			for(EmployeeBean e: employees) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void retrieveEmployeeDetailsWithInSalaryRange2(Double lowerBound, Double upperBound) {
		List<EmployeeBean> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeDetailsWithInSalaryRange2(lowerBound,upperBound);
			
			for(EmployeeBean e: employees) {
				System.out.println("Hello");
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
