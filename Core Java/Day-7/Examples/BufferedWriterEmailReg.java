package com.example.io;
import java.io.*;
import java.util.Scanner;

public class BufferedWriterEmailReg {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input
            System.out.println("Enter Your Name:");
            String name = scanner.next();
            System.out.println("Enter Email Id:");
            String email = scanner.next();

            // Creating the final output message
   String finalValue = "Welcome " + name + ", Thank you for registering your email id, " + email + ".";

            // Creating FileWriter and BufferedWriter
            FileWriter fileWriter = new FileWriter("d:/newFile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            // Writing data to the file
            bufferedWriter.write(finalValue);
            System.out.println("Information is written to the file successfully.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                // Close BufferedWriter (automatically closes FileWriter)
                if (bufferedWriter != null) bufferedWriter.close();
                if (scanner != null) scanner.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
