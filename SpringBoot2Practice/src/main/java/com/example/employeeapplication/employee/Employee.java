package com.example.employeeapplication.employee;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
	
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private LocalDate dateOfBirth;

	public Employee(String firstname, String lastname, String email, LocalDate dateOfBirth) {
		super();
		this.id = new Random().nextLong();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	} 

}
