package com.revature.main;

/* 
 * Wrapper Classes
 * ------------------------
 * Wrapper classes are Object classes that represent primitive types.
 * 
 * Wrapper classes have a few uses:
 * 1. Primitive types cannot be used as generic arguments within Java. Whenever
 * 		you need to generically type something that would be primitive, use a wrapper
 *		class for that primitive.
 * 2. They allow assignments of null values.
 * 3. They expose a number of helper utility functions as static functions on the
 * 		class.
 * 
 * Wrapper classes are named using an initial capital and the fully spelled
 * name of the primitive.
 * 
 * Primitive   	|  Wrapper
 * -------------+--------------
 * byte			|	Byte
 * short		| 	Short
 * int			|	Integer
 * long			|	Long
 * float		|	Float
 * double		|	Double
 * boolean		| 	Boolean
 * char			|	Character
 */
public class WrapperClasses {
	public static void main(String[] args) {
		
		// Wrapper types can be assigned normally just like primitives
		Integer i = 0;
		Byte b = 20;
		Boolean bool = true;
		
		// They can also be assigned null values
		Long myLong = null;
		
		// They also expose a variety of helper functions and values
		Integer bigInteger = Integer.MAX_VALUE;

		// Autoboxing and Autounboxing
		/*
		 * Autoboxing and autounboxing allow us to smoothly convert between
		 * wrapper and primitive types.  Autoboxing is the process of automatically
		 * boxing a primitive into a wrapper.  Autounboxing is the process of
		 * automatically unboxing a primitive value from a wrapper.
		 */
		
		// Autoboxing
		int primitiveInt = 20;
		Integer wrapper = primitiveInt;
	
		// Autounboxing
		int newPrimitiveInt = wrapper;
	}
}
