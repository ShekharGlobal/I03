package com.example.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashMain {
    public static void main(String[] args) {
        // Using diamond operator to create HashSet
        HashSet<String> items = new HashSet<>();
        
        // Adding elements to the HashSet
        items.add("Apple");
        items.add("Banana");
        items.add("Carrot");
        items.add("Broccoli");
        items.add("Cherry");
        items.add("Spinach");

        // Printing the HashSet
        System.out.println("Items HashSet: " + items);

        // Checking if the HashSet contains specific elements
        boolean hasApple = items.contains("Apple");
        System.out.println("Contains 'Apple': " + hasApple);

        boolean hasOrange = items.contains("Orange");
        System.out.println("Contains 'Orange': " + hasOrange);

        // Finding the size of the HashSet
        int size = items.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterating using a for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String item : items) {
            System.out.println(item);
        }

        // Iterating using an iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element by value
        items.remove("Carrot");
        System.out.println("\nAfter removing 'Carrot': " + items);

        // Checking if the HashSet is empty
        boolean isEmpty = items.isEmpty();
        System.out.println("Is the HashSet empty: " + isEmpty);

        // Converting the HashSet to an array
        String[] itemsArray = items.toArray(new String[0]);
        System.out.println("\nItems Array:");
        for (String item : itemsArray) {
            System.out.println(item);
        }

        // Clearing the HashSet
        items.clear();
        System.out.println("\nAfter clearing the HashSet: " + items);
    }
}
