package com.example.string;

public class StringDemo {

	public static void main(String[] args) {
		String name="Jonathan";
		System.out.println("Name: "+ name);
		System.out.println("3rd character of Name: "+ name.charAt(2));
		System.out.println("Jonathan compared to  Solomon: "+name.compareTo("solomon"));
		System.out.println("is Jonathan equal to Jonathan: "+ name.equals("Jonathan"));
		System.out.println("Length of the Name: "+ name.length());
		System.out.println("Replace a's with e's in name: "+ name.replace('a','e'));
		
		int index=name.indexOf('a');
		
		System.out.println(index);
		
		String t= name.substring(2,7);
		
		System.out.println(t);

	}

}
