package com.example.employeeapplication.employee.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutLibrary {

	@Pointcut("execution(* com.example.employeeapplication.employee.EmployeeRepository.*(..))")
	public void employeeRepositoryCalls() {
		// Pointcut for Employee Repository Calls
	}
	
	@Pointcut("execution(* com.example.employeeapplication.employee.EmployeeService.*(..))")
	public void employeeServiceCalls() {
		// Pointcut for Employee Service Calls
	}
	
	@Pointcut("execution(* com.example.employeeapplication.EmployeeApplication.run(..))")
	public void commandLineLoadData () {
		// Pointcut for CommandLineRunner
	}
	
}
