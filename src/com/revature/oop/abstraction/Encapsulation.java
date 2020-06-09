package com.revature.oop.abstraction;

/**
 * What is encapsulation? The principle of encapsulation is that the class is
 * responsible for maintaining its own state. It controls its state and anything
 * external to the class that wants to affect state, should go through a method
 * that allows the class to define logic to manage its own state.
 * 
 * Implementation of encapsulation in Java Make fields private, provide
 * getter/setter functions.
 *
 */
public class Encapsulation {
	private String a;
	private int b;
	private char c;

	/* code generation in eclipse - alt+shift+s */
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

}
