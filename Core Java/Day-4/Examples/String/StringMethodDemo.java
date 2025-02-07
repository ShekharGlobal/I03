package com.example.string;
public class StringMethodDemo {
    public static void main(String[] args) {
        // Declare and initialize the string
        String name = "Jonathan";
        
        // Print the name
        System.out.println("name: " + name);
        
        // Print the 3rd character of the name (index starts at 0)
        System.out.println("3rd character of name: " + name.charAt(2));  // Prints the character at index 2 ('n')
        
        // Compare "Jonathan" with "Solomon"
        /**
         * 'J' (74) < 'S' (83), so it knows "Jonathan" is smaller than 
         * "Solomon", and therefore, it returns a negative number.
         */
        System.out.println("Jonathan compared to Solomon: " + name.compareTo("Solomon"));
        
        // Check if "Jonathan" is equal to "Jonathan"
        System.out.println("Is Jonathan equal to Jonathan? " + name.equals("Jonathan"));
        
        // Print the length of the string
        System.out.println("Length of name: " + name.length());
        
        // Replace all 'a's with 'e's in the string
        System.out.println("Replace 'a' with 'e' in name: " + name.replace('a', 'e'));
        
        // Find the index of character 'a' in the string
        int index = name.indexOf('a');
        System.out.println("Index of 'a' in the name: " + index);
        
        // Get a substring from index 2 to 8 (start index 2, end index 8)
        String substring = name.substring(2, 8);
        System.out.println("Substring from index 2 to 8: " + substring);
    }
}
