package com.revature.oop.abstraction;

/**
 * Inheritance
 * ---------------------------
 * What is inheritance?
 * Inheritance is the process by which a class may inherit the state and behavior
 * of a parent class.  Inheritance is applied when we declare a class to extend
 * another. A class may extend only one class, so we must define a hierarchy that 
 * makes sense with this constraint.  Inheritance exists as a method to prevent
 * code duplication.
 * 
 *  */
public class Inheritance {

}


class Animal {
	String name;
	
	Animal(String name) {
		this.name = name;
	}
}

class Canine extends Animal {
	String furColor;
	
	Canine(String furColor, String name) {
		super(name);
		this.furColor = furColor;
	}
	
}

class Dog extends Canine {
	String owner;
	
	Dog(String owner, String furColor, String name) {
		super(furColor, name);
		this.owner = owner;
	}
	
	
}
