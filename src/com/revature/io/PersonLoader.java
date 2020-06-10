package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonLoader {
	public static void main(String[] args) {
		File file = new File("person");
		Person person = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));		
			person = (Person) (ois.readObject());
			ois.close();
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}		
		
		System.out.println(person);
	}
}
