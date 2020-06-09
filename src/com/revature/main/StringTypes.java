package com.revature.main;

/**
 * In Java all strings are objects.  The String type is a class. Strings themselves
 * are immutable. Once created a String CANNOT be changed. We can reassign a reference
 * but the original string cannot be changed.  Strings are also one of the only object
 * types to have a literal form in Java.
 * 
 * In memory, Strings are generally stored in a special part of heap memory. This space
 * is called the String Pool.  This is a performance feature of the Java language. To 
 * ensure that repeated usage of the same Strings do not cause a heavy performance
 * impact, repeated strings actually reference the same string in the string pool. 
 * However, as a consequence, Strings needed to be made immutable.  This means that
 * any string manipulation will result in performance hits because every kind of
 * manipulation will need to create a completely new String object. If you're doing
 * heavy string manipulation, you should not be using the String class.
 * 
 * Not every string goes into the string pool.  Strings will be placed in the string
 * pool at compilation time if the string value is deterministic.  This means that
 * they are defined with a string literal or an expression that is deterministic and
 * can be preevaluated at compile time and treated like a literal. Strings created in
 * a non-constant fashion through string manipulation will not be placed in the string
 *  pool, however if we know they should be we can use the .intern function to place
 *  in the string pool manually. 
 *
 */
public class StringTypes {
	public static void main(String[] args) {
//		poolDemo();
		performanceTest();
	}
	static void poolDemo() {
		String a = "Hello World";
		String b = "Hello World";
		String c = "Hello" + " World";
		String d = "Hello".concat(" World");
		
		// == for object types is memory comparison - true when they are exactly
		// the same object IN MEMORY
		
		// .equals - Value comparison. Overrideable function for custom implementation
		//	of equality for that type. In Strings, .equals means the string value is equal.
		
		System.out.println("a == b -> " + (a == b));
		System.out.println("a.equals(b) -> " + (a.equals(b)));
		System.out.println("a == c -> " + (a == c));
		System.out.println("a.equals(c) -> " + (a.equals(c)));
		System.out.println("a == d -> " + (a == d));
		System.out.println("a.equals(d) -> " + (a.equals(d)));
	}
	
	/**
	 * StringBuilder & StringBuffer - Mutable String implementations. These
	 * classes allow us to mutate strings in a performant. The difference between
	 * the two is that StringBuilder is not thread safe and StringBuffer is thread
	 * safe.  Being threadsafe causes a minor performance impact, so use StringBuffer
	 * only when its possible the string will be mutated by multiple threads. 
	 * Otherwise use StringBuilder. 
	 */
	
	public static void performanceTest() {
		long iterations = 1_000_000;
		long start = System.currentTimeMillis();
	
		String a = "a";
		for(int i = 0; i < iterations; i++) {
			a = a + "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("String milliseconds: " + (end - start));
		
		
		start = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("a");
		for(int i = 0; i < iterations; i++) {
			buffer.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer milliseconds: " + (end - start));
		
		start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("a");
		for(int i = 0; i < iterations; i++) {
			builder.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder milliseconds: " + (end - start));
		
		
	}
}
