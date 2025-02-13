package com.example.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            // Creating a FileWriter and BufferedWriter
            FileWriter fileWriter = new FileWriter("d:/info.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            // Writing data to the file
            bufferedWriter.write("Hello");
            bufferedWriter.newLine(); // Writing a new line
            bufferedWriter.write("Welcome");

            System.out.println("Information is written to the file successfully.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                // Close BufferedWriter (it also closes FileWriter)
                if (bufferedWriter != null) bufferedWriter.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
