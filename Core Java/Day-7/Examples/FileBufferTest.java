package com.example.io;
import java.io.*;

public class FileBufferTest {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        BufferedInputStream bufferInput = null;

        try {
            // Creates a FileInputStream object on the specified file
            fileInput = new FileInputStream("d:/test.txt");

            // Creates a BufferedInputStream from the FileInputStream
            bufferInput = new BufferedInputStream(fileInput);

            byte[] contents = new byte[1024]; // Buffer of 1024 bytes
            int bytesRead;

            while ((bytesRead = bufferInput.read(contents)) != -1) {
            	System.out.println(bytesRead);
                String strFileContents = new String(contents, 0, bytesRead);
                System.out.println("The content of the file read using BufferedInputStream is:\n" + strFileContents);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bufferInput != null) {
                    bufferInput.close();
                }
                if (fileInput != null) {
                    fileInput.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
