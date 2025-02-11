package com.example.exception;

public class ThrowDemo {
	
	public void div() {
		int x=100;
		int y=2;
		int z=x/y;
		System.out.println(z);
		
		throw new ArithmeticException();
	}
	
	

	public static void main(String[] args) {
		
		ThrowDemo d1= new ThrowDemo();
		try {
		d1.div();
		}
		catch(ArithmeticException e) {
			System.out.println("div by zero");
		}

	}

}
