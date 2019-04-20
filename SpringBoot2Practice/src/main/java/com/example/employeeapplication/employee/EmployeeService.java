package com.example.employeeapplication.employee;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees() {
		
		return repository.getEmployees();
	}
	
	public Employee getOldestEmployee() {
		
		Employee employee = repository.getEmployees()
				.stream()
				.min(Comparator.comparing(Employee::getDateOfBirth))
				.orElseThrow(NoSuchElementException::new);
		
		return employee;
	}
	
	public Employee getYoungestEmployee() {
		
		Employee employee = repository.getEmployees()
				.stream()
				.max(Comparator.comparing(Employee::getDateOfBirth))
				.orElseThrow(NoSuchElementException::new);
		
		return employee;
	}
}
