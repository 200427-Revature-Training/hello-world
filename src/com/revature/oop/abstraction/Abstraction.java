package com.revature.oop.abstraction;

/**
 * What is abstraction?
 * 
 * Abstraction tells us WHAT a class or function does rather than HOW it does it.
 * This allows us to focus on how different classes integrate with one another
 * without be constrained by the details of their individual implementation.
 * 
 * How is abstraction implemented in Java?
 * 
 * Key focus of abstraction is the 'abstract method'.  An abstract method is a
 * method signature with no implementation. This method declares what it accepts and
 * what it returns, but does not tell you how it does it.
 * 
 * Abstract methods are only valid within:
 * 1. abstract class - A non-instantiatable class - Must be extended for usage
 * 2. interfaces - A structure implementable by classes. Methods are abstract by default
 * 		in an interface.
 * 
 *
 */
public class Abstraction {

}

abstract class MyAbstractClass {
	/* In an abstract class abstract methods must be declared with the abstract
	 * 	keyword */
	abstract void doSomething();
}


interface MyInterface {
	/* Any field declared in an interface is implicitly public, static, final */
	
	/* Any method declared in an interface is implicitly public and abstract */
	void doSomething();
	
	/* Java 8+ you can provide a default implementation to methods in an interface 
	 * 	using the default keyword
	 */
	default void doDefaultSomething() {
		System.out.println("Hello");
	}
}


