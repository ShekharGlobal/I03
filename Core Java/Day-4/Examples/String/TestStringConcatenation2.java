package com.example.string;

class TestStringConcatenation2 {
	public static void main(String args[]) {
		
		String course = "Welcome";
		System.out.println(course instanceof Object);
		
		String s="Sachin"+" Tendulkar";
		System.out.println(s);//Sachin Tendulkar
		
		
		System.out.println(50 + 30 + "Sachin" + (40 + 40));
	}
}