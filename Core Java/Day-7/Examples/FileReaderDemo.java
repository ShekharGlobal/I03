package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader fileReader = null;

		try {
			// Creating a new FileReader and opening the file
			fileReader = new FileReader("d:/test.txt");
			int chars;

			// Reading characters from the file
			while ((chars = fileReader.read()) != -1) {
				System.out.print((char) chars); // Print without newline for continuous text
			}

		} catch (FileNotFoundException fileNotFound) {
			fileNotFound.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close(); // Close only if not null
				}
			} catch (IOException ioe) {

			}
		}
	}
}