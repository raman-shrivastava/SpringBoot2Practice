package com.example.employeeapplication.employee;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceMockitoTest {

	@InjectMocks
	private EmployeeService employeeService;
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@Before
	public void loadMockData() {
		
		List<Employee> eList = new ArrayList<Employee>() {
			{
				add(new Employee("Firstname001", "Lastname001", "somebody001@abc.com", LocalDate.of(1985, 1, 1)));
				add(new Employee("Firstname002", "Lastname002", "somebody002@abc.com", LocalDate.of(1987, 1, 1)));
			}
		};
		
		Mockito.when(employeeRepository.getEmployees()).thenReturn(eList);
	}
	
	@Test
	public void testOldestEmployee() {
		
		assertEquals("Firstname001", employeeService.getOldestEmployee().getFirstname());
	}
	
	@Test
	public void  testYoungestEmployee() {
		
		assertEquals("Firstname002", employeeService.getYoungestEmployee().getFirstname());
	}

}
