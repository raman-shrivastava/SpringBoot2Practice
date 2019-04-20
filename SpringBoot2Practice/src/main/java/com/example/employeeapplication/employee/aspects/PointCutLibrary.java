package com.example.employeeapplication.employee.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutLibrary {

	@Pointcut("execution(* com.example.employeeapplication.employee.EmployeeRepository.*(..))")
	public void employeeRepositoryCalls() {}
	
	@Pointcut("execution(* com.example.employeeapplication.employee.EmployeeService.*(..))")
	public void employeeServiceCalls() {}
	
}
