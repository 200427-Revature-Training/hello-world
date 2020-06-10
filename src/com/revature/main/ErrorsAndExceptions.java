package com.revature.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Exception handling in Java is more robust than in JavaScript.  We have several
 * classifications of exceptional state that behave in different ways.
 * 
 * All types of exceptional state are expressed through an interface that allows
 * them to be thrown called Throwable.
 * 
 * There are two top level implementations of this interface - Error and Exception.
 * 
 * Errors are serious exceptional states that are likely to kill your app and we
 * should probably attempt to recover from. Often Errors are associated with problems
 * at the OS, hardware, or JVM level.
 *
 * More recoverable exceptional states are classified as Exceptions. Exceptions
 * are grouped into two categories, checked and unchecked.  Checked exception MUST
 * have try/catch logic.  Not supplying such logic is a compilation error. 
 * Unchecked exceptions do not require try/catch logic.  This is because you can
 * generally apply programmatic logic to resolve unchecked exception before they
 * are thrown.
 * 
 * Common development patterns - In most modern Java frameworks and tooling checked
 * exceptions are avoided, even for things that would normally be a checked exception
 * in Java. This is to cut down on boilerplate code.
 */
public class ErrorsAndExceptions {
	static void stackOverflowDemo() {
		stackOverflowDemo();
	}
	
	static void OOMError() {
		List<String> list = new ArrayList<>();
		String str = "a";
		int i = 0;
		while(true) {
			System.out.println(i++);
			str = str + "a";
			list.add(str);
		}
	}
	
	static void uncheckedDemo() {
		int y = 0;
		int x = 0;
		if ( y != 0) {
			x = 10 / y;			
		} else {
			// whatever fallback logic you want
		}
		
		y = 3;
		int[] arr = {1, 2, 3};
		if(y < arr.length) {
			x = arr[3];			
		}
		
		String myString = Math.random() < 0.5 
			? null 
			: "Hello";
	
		if(myString != null) {
			byte[] bytes = myString.getBytes();
		}
		
		
	}
	
	static void checkedDemo() {
		String myString = "Hello world";
		File file = new File("./my-file.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(myString);
			fw.close();
			System.out.println("File written!");
		} catch(IOException e) {
			System.out.println("File currently locked for writing. Please try again later.");
		}
	}
	
	public static void main(String[] args) {
		OOMError();
	}
}
