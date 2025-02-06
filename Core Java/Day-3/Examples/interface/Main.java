package com.example.interfaces;

public class Main {

	public static void main(String[] args) {
		
		IRead i1= new Student();
		System.out.println(IRead.pi);
		i1.getName();
		
		
		IRead i2= new HOD();
		i2.getName();
		i2.hello();
		
		
		Student s1= new Student();
		s1.getName();
		s1.getName2();
		s1.study();

	}

}
