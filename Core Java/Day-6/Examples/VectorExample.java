package com.example.collections;
import java.util.Vector;
import java.util.Iterator;

public class VectorExample {

    private Vector<String> vector;

    // Constructor
    public VectorExample() {
        vector = new Vector<>();
    }

    // Method to add elements to the Vector
    public void addElement(String element) {
        vector.add(element);
        System.out.println("Added: " + element);
    }

    // Method to remove an element from the Vector by index
    public void removeElement(int index) {
        if (index >= 0 && index < vector.size()) {
            String removedElement = vector.remove(index);
            System.out.println("Removed: " + removedElement);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // Method to get an element from the Vector by index
    public String getElement(int index) {
        if (index >= 0 && index < vector.size()) {
            return vector.get(index);
        } else {
            return "Index out of bounds.";
        }
    }

    // Method to display all elements in the Vector
    public void displayElements() {
        System.out.println("Vector elements:");
        for (String element : vector) {
            System.out.println(element);
        }
    }

    // Method to clear all elements in the Vector
    public void clearElements() {
        vector.clear();
        System.out.println("All elements cleared.");
    }

    // Method to iterate over elements using an Iterator
    public void iterateElements() {
        System.out.println("Iterating over elements:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        VectorExample ve = new VectorExample();

        ve.addElement("Apple");
        ve.addElement("Banana");
        ve.addElement("Cherry");

        ve.displayElements();

        System.out.println("Element at index 1: " + ve.getElement(1));

        ve.removeElement(1);

        ve.displayElements();

        ve.iterateElements();

        ve.clearElements();

        ve.displayElements();
    }
}
