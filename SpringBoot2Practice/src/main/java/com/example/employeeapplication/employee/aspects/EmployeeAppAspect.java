package com.example.employeeapplication.employee.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class EmployeeAppAspect {

	public static final Logger logger = LoggerFactory.getLogger(EmployeeAppAspect.class);
	
	@Before("com.example.employeeapplication.employee.aspects.PointCutLibrary.employeeServiceCalls()")
	public void beforeMethod(JoinPoint joinPoint) {
		
		logger.info("Intercepting method before: {}", joinPoint);
	}
	
	/*
	 * @AfterReturning(
	 * value="execution(* com.example.employeeapplication.employee.EmployeeRepository.*(..))"
	 * , returning="result") public void afterReturningMethod(JoinPoint joinPoint,
	 * Object result) {
	 * 
	 * logger.info("Intercepting method after returning: {}. Returns: {}",
	 * joinPoint, result.toString()); }
	 */
	
	@Around("com.example.employeeapplication.employee.aspects.PointCutLibrary.employeeRepositoryCalls()")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {}: {} ms", joinPoint, timeTaken);
		
		return result;
	}
}
