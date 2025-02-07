package com.example.string;

class Teststringcomparison1 {
	public static void main(String args[]) {
		//literals
		//Pool Memory
		String s1 = "Sachin";
		String s2 = "Sachin";
		
		//constructor
		//Non Pool
		String s3 = new String("Sachin");
		
		String s4 = "Saurav";
		
		String s5= "Ratan";
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s5.compareTo(s2));
	}
}