package com.example.employeeapplication.employee;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.employeeapplication.EmployeeApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=EmployeeApplication.class)
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testOldestEmployee() {
		
		assertEquals("Raman", employeeService.getOldestEmployee().getFirstname());
	}
	
	@Test
	public void  testYoungestEmployee() {
		
		assertEquals("Rahul", employeeService.getYoungestEmployee().getFirstname());
	}

}
