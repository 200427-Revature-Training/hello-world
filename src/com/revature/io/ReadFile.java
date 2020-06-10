package com.revature.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("output-file.txt");
		try {
			BufferedInputStream bfs = new BufferedInputStream(new FileInputStream(file));
			
			// Buffer - Temporary store of memory/data
			byte[] buffer = new byte[8];
			int bytesRead = 0;
			
			// Read from the file and continue while bytesRead is > than 0
			while((bytesRead = bfs.read(buffer)) >= 0) {
				String str = new String(Arrays.copyOf(buffer, bytesRead));
				System.out.print(str);
			}
//			Hello, my name is Mitch
//			[tchMi]
			bfs.close();
		} catch(IOException e) {
			System.out.println("Something went wrong reading the file");
			e.printStackTrace();
		}
	}
}
