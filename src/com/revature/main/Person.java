package com.revature.main;

/*
 * Public is an access modifier
 * ------------------------------
 * public - can be used anywhere
 * protected - Can be used within the same package or by an inheriting class
 * (default) - Only within the same package
 * private - Only within the same class
 *  
 *  Access modifiers can be applied to classes, methods, and class properties (fields)
 *  
 *  
 *  Classes
 *  ----------------------------
 *  A .java file must have exactly 1 top-level public class. The file must be named
 *  the same as this class.
 */
public class Person {

	/* field declaration */
	/* access-modifier type field-name */
	public int myInt = 5;
	
	/* Method declaration */
	
	/* Method signature:  access-modifier return-type method-name(...params) { } */
	public String getHello() {
		return "Hello";
	}
	
	// varargs (variable arguments) - same as REST operator in JS
	// REST looked like this: sayHello(...names);
	/* Rules for var args - They must be the last argument in the argument list */
	public void sayHello(String... names) {
		for(String name : names) {
			System.out.println("Hello " + name);
		}
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.sayHello("Abby", "Billy", "Cindy", "Danny");
	}
	
	/* Creating a constructor - Constructors are special methods invoked when an
	 * instance of a class is created.  A constructor function is any function which:
	 * 1. Has the same name as the class
	 * 2. Has no declared type
	 * 3. (Implicitly or explicitly) Must call this or super in first line
	 * 
	 * Default constructor: If possible every class which does not explicitly declare
	 * a constructor will have a 'default constructor' that takes no arguments and
	 * calls super();
	 * */
	public Person() {
		int i = 5;
		i = Scopes.myStaticVariable;
	}	
}
