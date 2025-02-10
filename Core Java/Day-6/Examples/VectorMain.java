package com.example.collections;
import java.util.Vector;
import java.util.Iterator;

public class VectorMain {
    public static void main(String[] args) {
        // Using diamond operator to create Vector
        Vector<String> items = new Vector<>();
        
        // Adding elements to the vector
        items.add("Apple");
        items.add("Banana");
        items.add("Carrot");
        items.add("Broccoli");
        items.add("Cherry");
        items.add("Spinach");

        // Printing the vector
        System.out.println("Items Vector: " + items);

        // Retrieving elements using get()
        String firstItem = items.get(0);
        System.out.println("First Item: " + firstItem);

        // Finding the size of the vector
        int size = items.size();
        System.out.println("Size of the vector: " + size);

        // Iterating using a for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String item : items) {
            System.out.println(item);
        }

        // Iterating using a for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        // Iterating using an iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element by index
        items.remove(1); // Remove "Banana"
        System.out.println("\nAfter removing element at index 1: " + items);

        // Removing an element by value
        items.remove("Carrot");
        System.out.println("After removing 'Carrot': " + items);

        // Checking if the vector contains a specific element
        boolean hasBroccoli = items.contains("Broccoli");
        System.out.println("Contains 'Broccoli': " + hasBroccoli);

        // Checking if the vector is empty
        boolean isEmpty = items.isEmpty();
        System.out.println("Is the vector empty: " + isEmpty);

        // Converting the vector to an array
        String[] itemsArray = items.toArray(new String[0]);
        System.out.println("\nItems Array:");
        for (String item : itemsArray) {
            System.out.println(item);
        }

        // Clearing the vector
        items.clear();
        System.out.println("\nAfter clearing the vector: " + items);
    }
}
