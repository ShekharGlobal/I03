package com.example.exception;

public class ExcetionDemo {

	public static void main(String[] args) {

		try {
			int x = 100;
			int y = x / 0;

			System.out.println(y);
		}

		catch (NullPointerException e) {
			System.out.println("You Cannot divide by Zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You Cannot divide by Zero");
		}

		System.out.println("Rest of code....");

	}

}
