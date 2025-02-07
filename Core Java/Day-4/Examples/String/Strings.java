package com.example.string;

public class Strings {

	public static void main(String[] args) {
		
		String s1= new String();
		
		char chars[]= {'h','e','l','l','o'};
		String s2= new String(chars);
		
		byte bytes[]= {'w','o','r','l','d'};
		String s3= new String(bytes);
		
		String s4= new String(chars,1,3);
		
		String s5= new String(s2);
		
		String s6=s2;
		
		System.out.println(s1);//
		System.out.println(s2);//hello
		System.out.println(s3);//world
		System.out.println(s4);//ell
		System.out.println(s5);//hello
		System.out.println(s6);//hello
		

	}

}
