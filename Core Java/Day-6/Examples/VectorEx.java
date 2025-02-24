package com.example.collections;


import java.util.*;

public class VectorEx {

   
    public static void main(String[] args) {
        // Size of the Vector
        int n = 5;

        // Declaring the Vector with initial size n
        Vector<Integer> v = new Vector<Integer>(n);

        // Appending new elements at the end of the vector
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }

        // Printing elements
        System.out.println("Vector elements: " + v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector after deletion
        System.out.println("Vector after removal: " + v);

        // Iterating over vector elements using for loop
        System.out.print("Vector elements using for loop: ");
        for (int i = 0; i < v.size(); i++) {
            // Printing elements one by one
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
        

        // Using Enumeration to iterate over vector elements
        Enumeration<Integer> e = v.elements();
        System.out.print("Vector elements using Enumeration: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();
    }
}
