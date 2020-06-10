package com.revature.main;

import java.io.FileNotFoundException;

/**
 * Exception Propagation
 * 
 * Exceptions, if not handled, will propagate through an application.
 * When an exception is not handled by the method that throws it, then this
 * method immediately ends and control is returned to the calling method on 
 * the stack. This method then gets a chance to handle the method - if it fails
 * to do so, then it also will be removed from the stack and process will continue.
 * If there is no handler in the call stack at all, the program will be terminated.
 * 
 * 
 * Common Interview Question:
 * What is the difference between "throw", "throws", and "Throwable"?
 *
 * Throwable is an interface which is implemented by both Error and Exception and indicates
 * that instances of type Throwable can be thrown with the 'throw' keyword. Throw is a 
 * keyword which throws instances of Throwable so that the exception or error an propagate.
 * Throws is a keyword that attached to method signatures indicating that the named exception
 * can propagate from that method so that callers know to provide handling logic for it.
 */
public class ExceptionPropagation {

	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.a();
	}
	
	void a() {
		System.out.println("a starts");
		b();
		System.out.println("a ends");
	}
	void b() {
		System.out.println("b starts");
		c();
		System.out.println("b ends");
	}
	void c() {
		System.out.println("c starts");
		d();
		System.out.println("c ends");
	}
	void d() {
		System.out.println("d starts");
		try {
			e();
		} catch(FileNotFoundException e) {
			
		}
		System.out.println("d ends");
	}
	void e() throws FileNotFoundException {
		System.out.println("e starts");
		f();
		System.out.println("e ends");
	}
	void f() throws FileNotFoundException {
		System.out.println("f starts");
		g();
		System.out.println("f ends");
	}
	void g() throws FileNotFoundException {
		System.out.println("g starts");
		if (Math.random() > 0.5) {
			throw new FileNotFoundException();			
		}
		System.out.println("g ends");
	}
	
}


