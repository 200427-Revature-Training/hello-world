package com.revature.main;

/*
 * Variables in Java have 1 of 4 possible scopes:
 * 
 * 1. local (block) scope - variable declared in the body of a function
 * 2. function scope - Variable passed to a function as a parameter
 * 3. Object scope - Variable associated with an instantiated object of a class.
 * 		Can be referenced using object.property or this.property within a non-static
 * 		method of the object's class or inheriting class if visible. Get default values.
 * 4. Static scope - Variable associated with a class. Does not require any instantiated
 * 		instance nor is it bound to any. Can be accessed using Class.property outside
 * 		the class or simply by its name within the class. Can technically be accessed
 * 		via this, but this is discourage as its usage confusing. Get default values.
 * 
 * 
 * What is the difference between a static function and a non-static function?
 * 
 * Invocation:
 * * Static functions can be invoked without an instance of the class.
 * * Non-static functions must be invoked an instantiated object of that type.
 * 
 * Access to this:
 * * Static functions have no access to the 'this' keyword.
 * * Non-static functions have access to the 'this' keyword.
 */
public class Scopes {
	public static int myStaticVariable = 5;
	public int objectScopeVariable = 10;
	
	public void myFunction(int functionScopeVariable ) {
		int localScopeVariable = 20;
		localScopeVariable = myStaticVariable;
		localScopeVariable = objectScopeVariable;
	}
}


