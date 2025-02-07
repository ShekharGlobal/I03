package com.example.string;

class Testimmutablestring1 {
	public static void main(String args[]) {
		//pool memory
		String s = "Sachin";
		//String s1="Sachin";
		s = s.concat(" Tendulkar");
		System.out.println(s);
	}
}