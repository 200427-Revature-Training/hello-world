package com.revature.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

/**
 * File IO is useful when we need to store raw data, however it's not a great
 * for storing structured data that needs to have its structured maintained.
 * This is useful, but only to Java. Also, it's pretty much deprecated.
 * 
 * 
 */
public class SerializationDemo {
	
	public void savePerson(Person person) {
		File file = new File("./people/person");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(person);
			System.out.println(person.getFirstName() + " saved successfully");
		} catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		File file = new File("person");
		Person abby = new Person("Abby", "Adams", LocalDate.of(2000, 1, 1));
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(abby);
			System.out.println(abby.getFirstName() + " saved successfully");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

/**
 * Serializable is special kind of interface called a Marker interface.
 * Marker interfaces define simply that a class represents something without
 * providing any abstract methods.
 * 
 * Marker Interface - Interface with 0 abstract methods
 * 
 * "Java Bean" - Java Beans are classes which meet certain requirements that 
 * are required for integration with other Java packages.
 * 
 * 1. private fields
 * 2. public getter/setters (following getter/setter naming convention)
 * 3. Extend Serializable
 * 4. Accessible No-args constructor
 */

