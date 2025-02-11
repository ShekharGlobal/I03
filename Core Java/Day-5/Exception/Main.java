package com.example.exception;

public class Main {

	public static void main(String[] args) {
		
		ThrowsDemos d1= new ThrowsDemos();
		try {
		d1.div();
		}
		catch(ArithmeticException e) {
			System.out.println("div by zero");
		}
	}

}
