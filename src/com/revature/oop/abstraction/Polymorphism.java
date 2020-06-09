package com.revature.oop.abstraction;


/**
 * What is Polymorphism?
 * "Many forms"
 * Objects themselves and their methods can take on many forms under the same name.
 * 
 * Forms of polymorphism:
 * 	* Overriding methods - An inheriting class overriding the implementation of a 
 * 			parent method.
 *  * Overloading methods - The practice of writing two methods with the same name
 *  		but differing argument lists.
 *  * Polymorphic references - Variables whose reference type may be different
 *  		than the instance type.
 *  
 *  When we are calling functions on an object using a polymorphic reference, it 
 *  will use the overridden functions of the concrete type (instance type) rather
 *  than the implementations of the reference.
 *  
 *  When passing objects to overloaded functions where there could exist collisions
 *  between types. It will attempt to use the more specific type IF the reference 
 *  is of that type. If we are using polymorphic references, it will use the type
 *  nearest the polymorphic reference such that the reference is valid.
 *  
 *  
 */
public class Polymorphism {
	public static void main(String[] args) {
		Transportation transportation = new Transportation();
		Car car = new Car();
		
//		Not valid - Car does not encompass Transportation as a type
//		Car car = new Transportation();
		
		Transportation[] transports = { transportation, car };
		TransportationFactory tf = new TransportationFactory();
		
		// For each transport in transports
		for(Transportation transport : transports) {
//			transport.ride();
			
			// Both transportation and car call overload for transportation
			// due to the reference type being Transportation in both cases
			tf.copy(transport);
		}
		
		// Calls the copy overload for cars
		tf.copy(car);
		
//		car.ride("the store");
	}
	
}

class Transportation {
	public void ride() {
		System.out.println("You are transported to a new location");
	}
}

class Car extends Transportation {
	public void ride() {
		System.out.println("You ride in the car to a new location");
	}
	
	public void ride(String destination) {
		System.out.println("You ride in the car to " + destination);
	}
}

class TransportationFactory {
	public Car copy(Car car) {
		System.out.println("Making new car");
		return new Car();
	}
	
	
	public Transportation copy(Transportation transport) {
		System.out.println("Making new tranportation");
		return new Transportation();
	}
	
}