package com.revature.objects;

/**
 * Every object implicitly extends the Object class if it does explicitly extend
 * another class. Every class has a set of common methods that every class will
 * get by nature of being type Object.
 * 
 * These methods are often overridden to provide custom behavior or functionality.
 *
 *  Prior to the integration of Generic typing the Object type was used frequently
 *  to define classes or variables which could hold any type.
 */
public class ObjectClass {
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Defines equality for objects of type ObjectClass.
	 * Two instances of ObjectClass are considered equal if they have the same ID.
	 * Instances of ObjectClass cannot be equal to objects of differing classes.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ObjectClass) {
			ObjectClass objClass = (ObjectClass) obj;
			return this.id == objClass.id;			
		} else {
			return false;
		}
	}
}
