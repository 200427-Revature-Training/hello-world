package com.revature.main;

/**
 * These are fundamental data types that store raw data and are NOT class/objects.
 * There are 8 primitive types.
 * 
 * INTEGER TYPES
 * byte - 8 bit integer
 * short - 16 bit integer
 * int - 32 bit integer
 * long - 64 bit integer
 * 
 * FLOATING POINT TYPES
 * float - 32 bits of precision
 * double - 64 bits of precision
 * 
 * boolean - boolean type (true/false)
 * char - Represent a single character - in memory represented as 16 bit unsigned int
 *
 */
public class PrimitiveTypes {
	public static void main(String[] args) {
		/* Java is a strictly typed language */
		/* simple declaration */
		/* Variables in Java generally utilized camelCase */
		int myInt;
//		System.out.println(myInt); // cannot use this because myInt is not initialized
		
		myInt = 10;
		System.out.println(myInt);
		
		// Declare and assign
		short myShort = 20;
		
		// Valid - no risk of losing data
		long myLong = myShort;
		
		System.out.println(myShort);
		double myNewDouble = 2.5;
		
		// Prints 3.2727273 - Some precision is lost
		float myFloat = 3.272727272727272727f;
		System.out.println(myFloat);
		
		boolean myBoolean = false;
		char myChar = 'a';
		
		// Casting - Explicitly convert from one type to another
		char nextChar = (char) (myChar + 1);
		
		System.out.println(myChar);
		System.out.println(nextChar);
		
	}//end main
}
