package com.example.string;
public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object with initial value "Hello"
        StringBuilder strbuf = new StringBuilder("Hello");

        // Print the length of the StringBuffer
        System.out.print(strbuf.length());  // This returns 5
        System.out.println();  // Add a newline

        // Append "World" to the StringBuffer
        strbuf.append("World");
        System.out.println(strbuf);  // This returns "HelloWorld"

        // Insert "_Java " at index 5
        strbuf.insert(5, "_Java ");
        System.out.println(strbuf);  // This returns "Hello_Java World"

        // Set character at index 5 to a space (instead of _Java)
        strbuf.setCharAt(5, ' ');  // Correct syntax here (setCharAt should use a character, not a space without quotes)
        System.out.println(strbuf);  // This returns "Hello Java World"

        // Print the character at the 6th position (index 6)
        System.out.print("Character at 6th position: ");
        System.out.println(strbuf.charAt(6));  // This returns 'J'

        // Delete character at index 3
        strbuf.deleteCharAt(3);
        System.out.println(strbuf);  // This returns "Helo Java World"

        // Print the current capacity of the StringBuffer
        
        /**
         * Initial Capacity: 16.
           After Appending: Still 16 (sufficient for 10 characters).
           After Insertion: Still 16 (sufficient for 16 characters).
           After Further Expansion: The internal buffer might grow by 5
            (or another threshold), leading to a new capacity of 21 
            instead of doubling to 32.
            
            "Hello_Java World", which has 16 characters. 
            The current capacity of 16 is still enough to hold 16 characters,
             so no resizing is needed here.
         */
        System.out.print("Capacity of StringBuffer object: ");
        System.out.println(strbuf.capacity());  // Returns 21 (default capacity is 16, and it grows as needed)

        // Reverse the StringBuffer
        strbuf.reverse();
        System.out.print("Reversed string: ");
        System.out.println(strbuf);  // This returns "dirow avaJoleH"
    }
}
