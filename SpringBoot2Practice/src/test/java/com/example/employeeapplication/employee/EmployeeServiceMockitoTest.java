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
				add(new Employee("Raman", "Shrivastava", "raman.shrivastava@gmail.com", LocalDate.of(1985, 12, 17)));
				add(new Employee("Rahul", "Shrivastava", "itsrahul17@gmail.com", LocalDate.of(1987, 11, 22)));
			}
		};
		
		Mockito.when(employeeRepository.getEmployees()).thenReturn(eList);
	}
	
	@Test
	public void testOldestEmployee() {
		
		assertEquals("Raman", employeeService.getOldestEmployee().getFirstname());
	}
	
	@Test
	public void  testYoungestEmployee() {
		
		assertEquals("Rahul", employeeService.getYoungestEmployee().getFirstname());
	}

}
