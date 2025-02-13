package com.example.io;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        StringBuffer content = new StringBuffer();  // Initialize properly
        FileInputStream fileStream = null;
        int ch;

        try {
            fileStream = new FileInputStream("d:/test.txt"); // Specify the correct path

            while ((ch = fileStream.read()) != -1) { // Corrected syntax
                content.append((char) ch); // Append character inside the loop
            }

        } catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        } catch (IOException ioexp) {
            ioexp.printStackTrace();
        } finally {
            try {
                if (fileStream != null) { // Avoid NullPointerException
                    fileStream.close();
                }
            } catch (IOException ioexp) {
                ioexp.printStackTrace();
            }
        }

        // Print content outside the try-finally block
        System.out.println(content);
    }
}
