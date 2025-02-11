package com.example.exception;

public class ThrowsDemos {
	
	public void div() throws ArithmeticException{
		
		int x=100;
		int y=x/0;
		System.out.println(y);
	}

}
