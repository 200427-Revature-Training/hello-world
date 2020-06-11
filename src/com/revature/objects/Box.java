package com.revature.objects;

import java.util.function.BiFunction;

public class Box {
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		String str = "Hello world";
		
		// Store the string in the box
		box.setObject(str);
		
		// When using the object class, it can't infer the type
		// We must explicitly cast the type to the type of the assignment
		// This means it becomes the programmers responsibility to remember it
		String myString = (String) box.getObject();
		
		GenericBox<String> genericBox = new GenericBox<>();
		genericBox.setObject("Goodbye!");
		myString = genericBox.getObject();
	}
}


/**
 * Generic typing maintains are ability to validate types at compile time.
 * "Compile time type safety". Essentially we can create reusable objects
 * that interact with a variable type without sacrificing type safety.
 * 
 * Note: This type safety is entirely compile time.
 *
 * In Java the bounding of generic typing can be limited using the 
 * 'T extends CharSequence' syntax.  There is also a syntax using
 * 'super' which declares a superclass of another class.
 *
 * @param <T>
 */
class GenericBox <T extends CharSequence> {
	private T object;
	
	public T getObject() {
		return object;
	}
	
	public void setObject(T object) {
		this.object = object;
	}
}

