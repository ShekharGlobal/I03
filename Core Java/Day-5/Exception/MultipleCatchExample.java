package com.example.exception;
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int den = Integer.parseInt(args[3]);
            System.out.println(3 / 0);
        } catch (ArrayIndexOutOfBoundsException ab) {
            // Exception a handled here
            System.out.println("Error: No argument provided.");
        } catch (ArithmeticException ar) {
            // Exception b handled here
            System.out.println("Error: Division by zero.");
        }
    }
}
