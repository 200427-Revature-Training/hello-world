package com.revature.io;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private LocalDate birthdate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Person(String firstName, String lastName, LocalDate birthdate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate + "]";
	}
	
	
}