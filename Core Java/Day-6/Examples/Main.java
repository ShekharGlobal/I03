package com.example.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Using diamond operator to create ArrayList
      // List<String> items = new ArrayList<>();
    	
    	List<String> items = new Vector<>();
    	
        // Adding elements to the list
        items.add("Apple");
        items.add("Banana");
        items.add("Carrot");
        items.add("Broccoli");
        items.add("Cherry");
        items.add("Spinach");

        // Printing the list
        System.out.println("Items List: " + items);

        // Retrieving elements using get()
        String firstItem = items.get(0);
        System.out.println("First Item: " + firstItem);

        // Finding the size of the list
        int size = items.size();
        System.out.println("Size of the list: " + size);

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
        java.util.Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element by index
        items.remove(1); // Remove "Banana"
        System.out.println("\nAfter removing element at index 1: " + items);

        // Removing an element by value
        items.remove("Carrot");
        System.out.println("After removing 'Carrot': " + items);

        // Checking if the list contains a specific element
        boolean hasBroccoli = items.contains("Broccoli");
        System.out.println("Contains 'Broccoli': " + hasBroccoli);

        // Checking if the list is empty
        boolean isEmpty = items.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

       

        // Clearing the list
        items.clear();
        System.out.println("\nAfter clearing the list: " + items);
    }
}
