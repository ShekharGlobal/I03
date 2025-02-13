package com.example.io;

import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		

		// Creating a FileReader and BufferedReader for reading the file
		FileReader fileReader = new FileReader("d:/test.txt");
		BufferedReader bufReader = new BufferedReader(fileReader);

		System.out.println("The Data read from the file using BufferedReader is: ");

		String line;
		while ((line = bufReader.readLine()) != null) {
			System.out.println(line);
		}

		bufReader.close();
		fileReader.close();

	}
}
