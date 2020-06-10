package com.revature.io;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Scanner is an input class that is frequently used to prompt for input from
 * the user. It's not the only mechanism for this and not the best tool for
 * the job.
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
//		Console console = System.console();
		Scanner scanner = new Scanner(System.in);
		
		Person person = new Person();
		
		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = scanner.nextLine();
		
		System.out.print("Enter birthdate in ISO (2010-06-30) : ");
		String birthdateISO = scanner.nextLine();
		LocalDate birthdate = LocalDate.parse(birthdateISO);
		
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setBirthdate(birthdate);
		
		SerializationDemo serializer = new SerializationDemo();
		serializer.savePerson(person);
	}
}
