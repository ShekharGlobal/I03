package com.example.oops;

public class College {

	public static void main(String[] args) {
	
		Student s1= new Student();
		s1.setName("Bhargav");
		System.out.println("Name is :"+ s1.getName());
		
		s1.setAge(21);
		System.out.println("Age is "+ s1.getAge());
		
		
		s1.setAddress("Bangalore");
		
		System.out.println("Address is "+ s1.getAddress());

	}

}
