package com.example.arrays;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2x3 matrix
        int[][] marks = new int[2][3];

        // Assign values to the array
        marks[0][0] = 41;
        marks[0][1] = 38;
        marks[0][2] = 28;
        marks[1][0] = 22;
        marks[1][1] = 32;
        
        
        
        marks[1][2] = 34;

        // Print the array elements
        System.out.println("Two Dimensional Array:");
        for (int i = 0; i < marks.length; i++) { // Loop through rows
            for (int j = 0; j < marks[i].length; j++) { // Loop through columns
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

       
    }
}
