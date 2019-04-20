package com.example.employeeapplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.employeeapplication.employee.Employee;
import com.example.employeeapplication.employee.EmployeeRepository;
import com.example.employeeapplication.employee.EmployeeService;


@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
		
		/*
		 * EmployeeService eService = context.getBean(EmployeeService.class);
		 * 
		 * Employee yEmployee = eService.getYoungestEmployee();
		 * logger.info("Youngest Employee: {} {} : {}", yEmployee.getFirstname(),
		 * yEmployee.getLastname(), yEmployee.getDateOfBirth());
		 */
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Loading test data to employee repository");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Firstname001", "Lastname001", "someboday001@abc.com", LocalDate.of(1985, 1, 1)));
		employees.add(new Employee("Firstname002", "Lastname002", "someboday002@abc.com", LocalDate.of(1987, 1, 1)));
		employees.add(new Employee("Firstname003", "Lastname003", "someboday003@abc.com", LocalDate.of(1977, 1, 1)));
		employees.add(new Employee("Firstname004", "Lastname001", "someboday004@abc.com", LocalDate.of(1980, 1, 1)));
		employees.add(new Employee("Firstname005", "Lastname002", "someboday005@abc.com", LocalDate.of(1982, 1, 1)));
		
		try {
			EmployeeRepository.loadEmployeeData(employees);
		} catch (IllegalArgumentException e) {
			logger.warn(e.getMessage());
		}
	}

}
