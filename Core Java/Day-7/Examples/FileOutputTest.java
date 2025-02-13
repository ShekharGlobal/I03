package com.example.io;

import java.io.*;
import java.util.Scanner;

public class FileOutputTest {
	public static void main(String[] args) {
		Scanner scanner = null;
		FileOutputStream fileOutput = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter Name: ");
			String name = scanner.next();

			// Creates a new file and opens it for writing
			fileOutput = new FileOutputStream("d:/newFile.txt");

			// Convert string to byte array and write to the file
			byte[] buffer = name.getBytes();
			fileOutput.write(buffer);

			System.out.println("Employee details successfully written to the file");

		} catch (FileNotFoundException fileOut) {
			fileOut.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fileOutput != null) {
					fileOutput.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}
}
