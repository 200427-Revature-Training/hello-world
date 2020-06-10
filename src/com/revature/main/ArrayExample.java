package com.revature.main;

import java.util.Arrays;

// import package.Class
// auto-imports - ctrl+shift+o

/**
 * In Java an array is a simple data structure that arranges a set number of
 * items of a defined type into contiguous memory. This data structure allows
 * constant time access to data and items are accessed using an index number.
 * 
 * The primary difference between JS and Java in terms of Arrays, is that Java
 * arrays are not nearly as flexible as JS arrays. Java arrays need a
 * predetermined size and cannot change. For this reason, there are similar data
 * structures that are flexible in the Collections package. The List interface
 * defines data structures that behave similarly to JS arrays.
 * 
 * Array literals in Java are defined using { } rather than [ ].
 *
 * There are a number of helper/utility functions defined on the Arrays class.
 */
public class ArrayExample {
	static int x ;
	/**
	 * Multidimensional arrays are arrays of arrays. For instance a 2D array
	 * is an array that contains arrays which then contain values/objects. Often
	 * these are visualized dimensionally, such that a 2D array might be represented
	 * on a 2D plane, a 3D array on a 3D plane.
	 */
	public static void array2DDemo() {
		int[][] my2dArray = new int[5][3];
		Arrays.fill(my2dArray, new int[] {1, 2, 3});


		// Using the static variable in arrow function - valid, but error prone
//		Arrays.setAll(my2dArray, (i) -> {
//			return new int[] {x++, x++, x++};
//		});
		
		Arrays.setAll(my2dArray, (i) -> {
			x++;
			return new int[] {i*3, i*3+1, i*3+2};
		});
		
		for(int[] arr : my2dArray) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(my2dArray[3][2]);
	}

	public static void basicArrayDemo() {
		int[] myArr = { 1, 2, 3 };

		// This will create array of size 5 with each index populated with default
		// int values (0).
		int[] myDeclaredArray = new int[5];

		// Assignment on index
		myDeclaredArray[0] = 1;
		myDeclaredArray[3] = 3;

		System.out.println(Arrays.toString(myDeclaredArray));

//		ArrayIndexOutOfBoundsException: 5
//		myDeclaredArray[5] = 10;
		for (Integer i : myDeclaredArray) {
			System.out.print(i + " ");
		}

		// Accessing length property for a standard for loop
		for (int i = 0; i < myDeclaredArray.length; i++) {
			System.out.println(myDeclaredArray[i]);
		}

	}

	public static void main(String[] args) {
		array2DDemo();
		array2DDemo();
	}
}