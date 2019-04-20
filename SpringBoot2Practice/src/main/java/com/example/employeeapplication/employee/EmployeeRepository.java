package com.example.employeeapplication.employee;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);
	
	private static List<Employee> employeeList = null;
	
	public static int loadEmployeeData(List<Employee> employees) {
		
		if (employeeList == null) {
			employeeList = new ArrayList<Employee>();
		}
		
		if (employees != null) {
			employeeList.addAll(employees);
			logger.info("Employee data loaded. {} records added.", employees.size());
		} else {
			throw new IllegalArgumentException("Data cannot be null.");
		}
	
		return employeeList.size();
	}
	
	public List<Employee> getEmployees() {
		
		return employeeList;
	}
}
