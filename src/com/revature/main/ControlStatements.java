package com.revature.main;

import java.util.Random;

/*
 * Control Statements / Control Structures / Flow Control
 */
public class ControlStatements {

	// Basically same as JS - but no truthy-falsy
	void ifStatement() {
		boolean predicate = true;

		if (predicate) {
			// do something
		} else if (predicate) {
			// something else
		} else {
			// even more something else
		}
	}

	// Ternary operates are compact conditional statements
	// Often used for conditional assignment or evaluation in a larger expression
	void ternaryOperator() {
		int i = 10 > 5 ? 1 : 2;
	}

	int maxInt(int a, int b) {
		return a > b ? a : b;

//		if (a > b) return a; 
//		return b;
	}

	/*
	 * Not every type is valid in a switch statement! Floating point numbers -
	 * invalid boolean - invalid non-string object types - invalid
	 * 
	 * valid: All int types EXCEPT long String char enums
	 * 
	 */
	void switchStatement() {
		char input = 'a';
		switch (input) {
		default:
			System.out.println(input);
		}
	}

	void whileStatement() {
		// do repeatedly while predicate is true
		boolean predicate = false;
		Random random = new Random();

		// This will never run
		while (predicate) {
			predicate = random.nextBoolean();
			// do something
		}
	}

	void doWhileStatement() {
		// do repeatedly while predicate is true
		boolean predicate = false;
		Random random = new Random();

		// This will run at least one time
		do {
			predicate = random.nextBoolean();
			// do something
		} while (predicate);
	}

	void forLoop() {
		int[] arr = { 1, 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	void enhancedForLoop() {
		int[] arr = { 1, 2, 3, 4 };
		for (Integer i : arr) {
			System.out.println(i);
		}
	}
}
