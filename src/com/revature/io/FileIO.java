package com.revature.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * IO - Input/Output
 * IO deals with the process of communicating information external to the
 * application runtime. This could be writing file to disk, messaging between
 * application, HTTP traffic, interacting with a database, etc.
 * 
 * Dealing with IO is an extremely common task in computing so it's important
 * to at least know the basics.
 * 
 * Most of the time that you will be working with IO it will be through some
 * higher level abstraction.
 * 
 * Java IO libraries:
 * 
 * io - Input/Output - Blocking IO
 * nio - "new Input/Output" - Nonblocking IO
 * nio2 - "new input/output 2" - Nonblocking, asynchronous, messaging, etc.
 */

public class FileIO {
	public static void main(String[] args) {
		try {
			File file = new File("output-file.txt");
			BufferedOutputStream bfs = new BufferedOutputStream(new FileOutputStream(file));
			String output = "Hello, I am a String which makes me immutable.";
			bfs.write(output.getBytes());
			bfs.close();
		} catch(IOException e) {
			System.out.println("Something went wrong saving the file");
			e.printStackTrace();
		}
	}
}
