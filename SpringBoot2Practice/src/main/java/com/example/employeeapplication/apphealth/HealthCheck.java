package com.example.employeeapplication.apphealth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.example.employeeapplication.employee.EmployeeService;

@Component
public class HealthCheck implements HealthIndicator {

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		boolean employeeServiceHealth = (employeeService != null);
		
		boolean service1 = true, service2 = true, service3 = true;
		
		boolean totalHealth = employeeServiceHealth && service1 && service2 && service3;
		
		Map<String, Object> details = new HashMap<String, Object>();
		details.put("EmployeeService", Boolean.valueOf(employeeServiceHealth));
		details.put("Service1", Boolean.valueOf(service1));
		details.put("Service2", Boolean.valueOf(service2));
		details.put("Service3", Boolean.valueOf(service3));
		
		if (totalHealth) {
			return Health.up().withDetails(details).build();
		} else {
			return Health.down().withDetails(details).build();
		}
	}

}
