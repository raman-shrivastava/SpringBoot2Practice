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
		
		return repository.getEmployees()
				.stream()
				.min(Comparator.comparing(Employee::getDateOfBirth))
				.orElseThrow(NoSuchElementException::new);
		
	}
	
	public Employee getYoungestEmployee() {
		
		return repository.getEmployees()
				.stream()
				.max(Comparator.comparing(Employee::getDateOfBirth))
				.orElseThrow(NoSuchElementException::new);
		
	}
}
