package com.example.io;

import java.io.*;

class Depersist {
	public static void main(String args[]) {
		try {
			// Creating stream to read the object
			FileInputStream fis = new FileInputStream("d://persist.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			Student s = (Student) in.readObject();
			// printing the data of the serialized object
			System.out.println(s.id + " " + s.name);
			
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}