package com.example.string;
public class StringMethodsExample {
    public static void main(String[] args) {
        // Create a String object
        String s1 = "Java programming is fun!";

        // 1. length() - Returns the length of the string
        System.out.println("Length of the string: " + s1.length()); // Output: 26

        // 2. charAt() - Returns the character at a specific index
        System.out.println("Character at index 5: " + s1.charAt(5)); // Output: 'p'

        // 3. toUpperCase() - Converts the string to uppercase
        System.out.println("Uppercase: " + s1.toUpperCase()); // Output: "JAVA PROGRAMMING IS FUN!"

        // 4. toLowerCase() - Converts the string to lowercase
        System.out.println("Lowercase: " + s1.toLowerCase()); // Output: "java programming is fun!"

        // 5. substring() - Extracts a substring from the string
        System.out.println("Substring (from index 5 to 15): " + s1.substring(5, 15)); // Output: "programming"

        // 6. contains() - Checks if the string contains a particular sequence of characters
        System.out.println("Contains 'fun': " + s1.contains("fun")); // Output: true

        // 7. indexOf() - Returns the index of the first occurrence of a character or substring
        System.out.println("Index of 'is': " + s1.indexOf("is")); // Output: 17

        // 8. replace() - Replaces a character or substring with another
        System.out.println("Replacing 'fun' with 'awesome': " + s1.replace("fun", "awesome")); // Output: "Java programming is awesome!"

        // 9. trim() - Removes any leading or trailing spaces
        String sentenceWithSpaces = "   Java programming is fun!   ";
        System.out.println("Trimmed string: '" + sentenceWithSpaces.trim() + "'");

        // 10. split() - Splits the string into an array of substrings
        String[] words = s1.split(" ");
        System.out.println("Words in the sentence:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
