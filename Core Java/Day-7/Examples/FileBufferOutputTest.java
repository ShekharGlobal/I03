package com.example.io;
import java.io.*;
import java.util.Scanner;

public class FileBufferOutputTest {
    public static void main(String[] args) {
        FileOutputStream fileOutput = null;
        BufferedOutputStream bufferOutput = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input
            System.out.println("Enter Employee Id: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.println("Enter Employee Name: ");
            String empName = scanner.nextLine();

            // Create the final string
            String finalValue = "Welcome " + empName + ", your Employee Id is " + empId;

            // Create FileOutputStream and BufferedOutputStream
            fileOutput = new FileOutputStream("d:/newFile.txt",true);
            bufferOutput = new BufferedOutputStream(fileOutput);

            // Write data to file
            bufferOutput.write(finalValue.getBytes());
            bufferOutput.flush(); // Ensure data is written before closing

            System.out.println("Data has been written into the file successfully.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bufferOutput != null) 
                	bufferOutput.close();
                if (fileOutput != null)
                	fileOutput.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
}
